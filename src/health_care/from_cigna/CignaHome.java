package health_care.from_cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CignaHome {

    public static String url = "https://www.cigna.com/";
    public static WebDriver driver;
    public static String driverPath = "browsers_driver/Windows/chromedriver.exe";
    public static String propertySet = "webdriver.chrome.driver";
    public static String searchButton = "//*[@id=\"ssi-includes\"]/div/header/div[2]/nav[1]/div/ul/li[4]/form/div/div/span/button";
    public static String cssSearchBox = "#search-desktop";
    public static String classAttribute = "search-results__keyword";
    public static String searchResult = "//*[@id=\"cignaTab\"]/div[2]/div[1]/div/a";


        // Home page set up
    @BeforeMethod
    public static void setUp() {
        System.setProperty(propertySet, driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
        // search for covid in the search box
    public static void covidSearch() throws InterruptedException {

        driver.findElement(By.cssSelector(cssSearchBox)).sendKeys("covid");
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);
    }

        // open the result of the first covid search result
    public static void readFirstSearchResult() throws InterruptedException {
        CignaHome.covidSearch();
        driver.findElement(By.xpath(searchResult)).click();
        Thread.sleep(5000);
    }
        // click on individual and families link
    public static void individualsAndFamilies() {
        driver.findElement(By.cssSelector("#individuals-families-level-one-link")).click();
    }
        // click on a medicar link
    public static void medicare() {
        driver.findElement(By.cssSelector("#medicare-level-one-link")).click();
    }
        // click on the employers and brokers link
    public static void employersAndBrokers() {
        driver.findElement(By.cssSelector("#employers-brokers-level-one-link")).click();
    }
        // click on health care provider
    public static void healthCareProvider() {
        driver.findElement(By.cssSelector("#health-care-providers-level-one-link")).click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }




}
