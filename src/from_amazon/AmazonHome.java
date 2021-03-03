package from_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHome {

    public static String driverPath= "browsers_driver/Windows/chromedriver.exe";
    public static WebDriver driver;
    public static String  url = "https://www.amazon.com/";
    public static String  propertyKey = "webdriver.chrome.driver";
    public static String  searchBar = "twotabsearchtextbox";
    public static String searchButton = "nav-search-submit-button"; // nav-search-submit-button
    public static String bookSerch = "//*[@id=\"nav-xshop\"]/a[6]";
    public static String verifyItem = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]";



        // Amazon Home page
    @BeforeMethod
    public static void setUp() throws InterruptedException {

        System.setProperty(propertyKey, driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
        //Search for a toys using a search bar on Amazon page
    public static void searchForToys() throws InterruptedException {

        driver.findElement(By.id(searchBar)).sendKeys("toys");
        driver.findElement(By.id(searchButton)).click();
    }
        // Searching a book in Amazon - sidney sheldon
    public static void booksLink(){
        driver.findElement(By.xpath(bookSerch)).click();
        driver.findElement(By.id(searchBar)).sendKeys("sidney sheldon");
        driver.findElement(By.id(searchButton)).click();
    }
        // buying book
    public static void buyingBook() throws InterruptedException {

        AmazonHome.booksLink();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/h2/a/span")).click();
    }
        // Clicking on Amazon cart #nav-cart-count
    public static void clickOnAmazonCart(){
        driver.findElement(By.cssSelector("#nav-cart-count")).click();
    }
        // to close opened browser
       @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
