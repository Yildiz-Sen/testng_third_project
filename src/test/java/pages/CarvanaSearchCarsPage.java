package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CarvanaSearchCarsPage {

    public CarvanaSearchCarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(css = "div[data-qa='menu-flex']")
    public List<WebElement> optionsFilterList;


}
