package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CarvanaBasePage;

public class CarvanaTest extends CarvanaBase{

    @BeforeMethod
    public void setPage(){carvanaBasePage = new CarvanaBasePage();}


@Test(priority = 1, description = "Validate Carvana home page title and url")
public void validateCarvanaHomePage(){
    Assert.assertEquals(driver.getTitle(), "Carvana | Buy & Finance Used Cars Online | At Home Delivery");
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/");
}


@Test(priority = 2, description = "Validate the Carvana logo")
public void validateCarvanaLogo(){
        Assert.assertTrue(carvanaBasePage.carvanaLogo.isDisplayed());
}


@Test(priority = 3, description = "Validate the main navigation section items")
    public void navigationItems() {

    String[] navigationItems = {"HOW IT WORKS", "ABOUT CARVANA", "SUPPORT & CONTACT"};

    for (int i = 0; i < carvanaBasePage.mainMenuItems.size(); i++) {
        Assert.assertTrue(carvanaBasePage.mainMenuItems.get(i).isDisplayed());
        Assert.assertEquals(carvanaBasePage.mainMenuItems.get(i).getText(), navigationItems[i]);
    }
}


    @Test(priority = 4, description = "Validate the sign in error message")
            public void signInError(){
        carvanaBasePage.signInButton.click();
        carvanaBasePage.enterEmailField.sendKeys("johndoe@gmail.com");
        carvanaBasePage.emailContinueButton.click();
        carvanaBasePage.enterPasswordField.sendKeys("abcd1234");
        carvanaBasePage.emailContinueButton.click();
        Assert.assertTrue(carvanaBasePage.errorBanner.isDisplayed());

    }

}






