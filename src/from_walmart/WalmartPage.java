package from_walmart;

import driver_info.DriverSelection;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WalmartPage extends DriverSelection {

    public static String url = "http://www.walmart.com/";
    public static String browserName = "chrome";

    @BeforeMethod
    public static void verifyWalmartHomePage() throws InterruptedException {
        DriverSelection.driverSelection(browserName,url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public static void searchWithSearchBar(){
   //     driver.findElement(By.className("i_a be_b header-GlobalSearch-input mweb-Typeahead-input i_b")).sendKeys("kitchen towels");
        driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("crayons");
        driver.findElement(By.cssSelector("#global-search-submit > span")).click();
    }
    @Test
    public static void applyingFilterOnSearchResult(){

        WalmartPage.searchWithSearchBar();
        driver.findElement(By.cssSelector("#variant-swatcher-item-Multicolor > div")).click();
    }


}
