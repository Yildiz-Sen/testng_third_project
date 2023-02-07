package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CarvanaBasePage;

public class CarvanaTest extends CarvanaBase{

    @BeforeMethod
    public void setPage(){carvanaBasePage = new CarvanaBasePage();}

    /*
    Test Case 1:
Test name = Validate Carvana home page title and url
Test priority = 1
Given user is on "https://www.carvana.com/"
Then validate title equals  "Carvana | Buy & Finance Used Cars Online | At Home Delivery"
And validate url equals  "https://www.carvana.com/"


Test Case 2:
Test name = Validate the Carvana logo
Test priority = 2
Given user is on "https://www.carvana.com/"
Then validate the logo of the “Carvana” is displayed


Test Case 3:
Test name = Validate the main navigation section items
Test priority = 3
Given user is on "https://www.carvana.com/"
Then validate the navigation section items below are displayed
|HOW IT WORKS     	|
|ABOUT CARVANA    	|
|SUPPORT & CONTACT	|

Test Case 4:
Test name = Validate the sign in error message
Test priority = 4
Given user is on "https://www.carvana.com/"
When user clicks on “SIGN IN” button
Then user should be navigated to “Sign in” modal
When user enters email as johndoe@gmail.com
And user clicks on "CONTINUE" button
And user enters password as "abcd1234"
And user clicks on "SIGN IN" button
Then user should see error message as "Email address and/or password combination is incorrect.

     */
@Test(priority = 1, description = "Validate Carvana home page title and url")
public void validateCarvanaHomeTitle(){
    Assert.assertEquals(driver.getTitle(), "Carvana | Buy & Finance Used Cars Online | At Home Delivery");
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/");
}


@Test(priority = 2, description = "Validate the Carvana logo")
public void validateCarvanaLogo(){
    Assert.assertTrue(carvanaBasePage.carvanaLogo.isDisplayed());
}


@Test(priority = 3, description = "Validate the main navigation section items")
    public void validateMainNavItems(){
    String[] headerResults = {"HOW IT WORKS", "ABOUT CARVANA", "SUPPORT & CONTACT"};
    for (int i = 0; i < headerResults.length; i++) {
        Assert.assertEquals(carvanaBasePage.mainNavItems.get(i).getText(), headerResults[i]);
    }
}


@Test(priority = 4, description = "Validate the sign in error message")
public void validateSignInErrorMessage(){
carvanaBasePage.signInButton.click();
carvanaBasePage.enterEmailField.sendKeys("johndoe@gmail.com", Keys.ENTER);
carvanaBasePage.enterPasswordField.sendKeys("abcd1234", Keys.ENTER);
Assert.assertEquals(carvanaBasePage.errorBanner.getText(), "Email address and/or password combination is incorrect.");
}



}
