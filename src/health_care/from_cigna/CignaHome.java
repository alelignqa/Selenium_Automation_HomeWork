package health_care.from_cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaHome {

    public static String url = "https://www.cigna.com/";
    public static WebDriver driver;
    public static String driverPath = "browsers_driver/Windows/chromedriver.exe";
    public static String propertySet = "webdriver.chrome.driver";
    public static String xpathSearch = "//*[@id=\"1564310141627\"]/div/header/div[2]/nav[1]/div/ul/li[4]/form/div/div/span/button";
    public static String cssSearchBox = "#search-desktop";
    public static String classAttribute = "search-results__keyword";
    public static String searchResult = "//*[@id=\"cignaTab\"]/div[2]/div[1]/div/a";



    @BeforeMethod
    public static void  setUp(){
        System.setProperty(propertySet,driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void covidSearch() throws InterruptedException {
        CignaHome.setUp();
        driver.findElement(By.cssSelector(cssSearchBox)).sendKeys("covid");
        driver.findElement(By.xpath(xpathSearch)).click();
    }
    @Test
    public static void readFirstSearchResult() throws InterruptedException {
        CignaHome.covidSearch();
        Thread.sleep(5000);
        driver.findElement(By.xpath(searchResult)).click();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
