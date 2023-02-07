package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CarvanaBasePage;
import pages.CarvanaSearchCarsPage;
import utilities.Waiter;

public class CarvanaSearchCarsTest extends CarvanaBase{



    @BeforeMethod
    public void setPage(){
        carvanaBasePage = new CarvanaBasePage();
        carvanaSearchCarsPage = new CarvanaSearchCarsPage();
    }

    @Test(priority = 5, description = "Validate the search filter options and search button")
    public void validateSearchButton(){
        String[] filterOptions =
                {"PAYMENT & PRICE", "MAKE & MODEL", "BODY TYPE", "YEAR & MILEAGE", "FEATURES", "MORE FILTERS"};
        carvanaBasePage.selectHeaderItem("SEARCH CARS");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/cars");
        for (int i = 0; i < filterOptions.length; i++) {
            Assert.assertEquals(carvanaSearchCarsPage.optionsFilterList.get(i).getText(), filterOptions[i]);
        }
    }

    @Test(priority = 6, description = "Validate the search result tiles")
    public void validateSearchResults(){
        carvanaBasePage.selectHeaderItem("SEARCH CARS");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/cars");

        }




    @Test(priority = 9, description = "test")
    public void test(){
        carvanaBasePage.selectHeaderItem("SEARCH CARS");
        Waiter.pause(10);
        for (int i = 0; i < carvanaSearchCarsPage.optionsFilterList.size(); i++) {
            System.out.println(carvanaSearchCarsPage.optionsFilterList.get(i).getText());
        }}

    /*
    Test Case 5:
Test name = Validate the search filter options and search button
Test priority = 5
Given user is on "https://www.carvana.com/"
When user clicks on "SEARCH CARS" link
Then user should be routed to "https://www.carvana.com/cars"
And user should see filter options
    |PAYMENT & PRICE     	|
    |MAKE & MODEL	    	|
    |BODY TYPE		|
    |YEAR & MILEAGE     	|
    |FEATURES	    	|
    |MORE FILTERS		|


Test Case 6:
Test name = Validate the search result tiles
Test priority = 6
Given user is on "https://www.carvana.com/"
When user clicks on "SEARCH CARS" link
Then user should be routed to "https://www.carvana.com/cars"
When user enters "mercedes-benz" to the search input box
And user clicks on "GO" button in the search input box
Then user should see "mercedes-benz" in the url
And validate each result tile

VALIDATION OF EACH TILE INCLUDES BELOW
Make sure each result tile is displayed with below information
1. an image
2. add to favorite button
3. tile body
ALSO VALIDATE EACH TILE BODY:
Make sure each tile body has below information
1. Inventory type - text should be displayed and should not be null or empty
2. Year-Make-Model information - text should be displayed and should not be null or empty
3. Trim-Mileage information - text should be displayed and should not be null or empty
4. Price - Make sure that each price is more than zero
5. Monthly Payment information - text should be displayed and should not be null or empty
6. Down Payment information - text should be displayed and should not be null or empty
7. Delivery chip must be displayed, and text is not null or empty

     */





}
