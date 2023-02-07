package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Waiter;

import java.util.List;

public class CarvanaBasePage {


    public CarvanaBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




@FindBy(css = "div[class*='Logo__LogoWrapper'] svg")
    public WebElement carvanaLogo;

    @FindBy(css = "[data-qa='menu-title']")
    public List<WebElement> mainNavItems;

    @FindBy(css = "a[class*='SignInLink']")
    public WebElement signInButton;

    @FindBy(css = "input[name='email']")
    public WebElement enterEmailField;

    @FindBy(css = "input[type='password']")
    public WebElement enterPasswordField;

    @FindBy(id = "error-banner")
    public WebElement errorBanner;

    @FindBy(css = "div[data-qa='header-items']>a")
    public List<WebElement> headerItemsList;

    public void selectHeaderItem(String header){
        Waiter.pause(5);
        for (WebElement element : headerItemsList) {
            if (element.getText().equals(header)) element.click();
        }
    }

}
