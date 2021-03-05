package from_walmart;

import driver_info.DriverSelection;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
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


    public static void searchWithSearchBar(){
   //     driver.findElement(By.className("i_a be_b header-GlobalSearch-input mweb-Typeahead-input i_b")).sendKeys("kitchen towels");
        driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("crayons");
        driver.findElement(By.cssSelector("#global-search-submit > span")).click();
    }

    public static void applyingFilterOnSearchResult(){

        WalmartPage.searchWithSearchBar();
        driver.findElement(By.cssSelector("#Gift-eligible-0-Gifting")).click();
    }


    public static void doAddItemToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("Sugar");
        driver.findElement(By.cssSelector("#global-search-submit > span")).click();
        driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li[4]/div/div[2]/div[5]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"add-on-atc-container\"]/div[1]/section/div[1]/div[3]/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public static void removeItemFromCart() throws InterruptedException {
        WalmartPage.doAddItemToCart();
        driver.findElement(By.cssSelector("#hf-cart > span > span")).click();
        driver.findElement(By.xpath("//*[@id=\"cart-root-container-content-skip\"]/div/div/div[1]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div/div[3]/div/button/span/span")).click();


    }


}
