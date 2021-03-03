package from_ebay;

import driver_info.HomePageSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayHome extends HomePageSetUp {

    public static String url = "https://www.ebay.com/";
    public static String driverName = "Fire Fox";

        // page set up for Ebay
    @BeforeMethod
    public static void homePageSetUp() throws InterruptedException {
        driverSelection(driverName,url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }
        // using a search bar to add a text for search
    public static void searchItemWithSearchbar(){
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Phones");
        driver.findElement(By.id("gh-btn")).click();

    }
        // Searching for phone using a search bar
    public static void selectBrandSamsungInPhonesSearch(){
        EbayHome.searchItemWithSearchbar();
        driver.findElement(By.cssSelector("#x-refine__group_1__0 > ul > li:nth-child(1) > div > a > div > span > input")).click();
    }
        // To open a Motors Links from the home page
    public static void clickOnMotersLink(){
  //      driver.findElement(By.linkText("Motors")).click();  // another option if necessary
        driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > a")).click();
    }
        // To open a daily deals links from the page
    public static void clickOnDailyDeals(){
        driver.findElement(By.cssSelector("#gh-p-1 > a")).click();
    }
        // To open Brand Outlet link from Ebay home page
    public static void clickOnBrandOutlet(){
        driver.findElement(By.cssSelector("#gh-p-4 > a:nth-child(1)")).click();
    }
    @Test    // To open an Electronic link from Ebay home page
    public static void openElectronicsLink(){
        driver.findElement(By.cssSelector("li.hl-cat-nav__js-tab:nth-child(5) > a:nth-child(1)")).click();
    }
        // to close the opened browsers
 //   @AfterMethod
    public static void tearDown(){
        driver.quit();
    }



}
