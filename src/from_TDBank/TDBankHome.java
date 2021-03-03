package from_TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TDBankHome {

    public static String url = "https://www.tdbank.com";
    public static WebDriver driver;
    public static String driverLocation = "browsers_driver/Windows/geckodriver.exe";
    public static String browserDriver = "webdriver.gecko.driver";

        // page set up
    @BeforeMethod
    public static void setUp() throws InterruptedException {

        System.setProperty(browserDriver,driverLocation);
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ensCall\"]/span[2]")).click(); // to close the pop up window
    }
        // click on offer button
    public static void getOfferButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.td-button:nth-child(3)")).click();
    }
        // open a small business link

    public static void smallBusiness() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[2]/a")).click();
    }
        // open a commercial link
    public static void commercial() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a")).click();
    }
        // open an investing and wealth link
    public static void investingAndWealth() throws InterruptedException {

        Thread.sleep(3000);
  //      driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[4]/a")).click();
        driver.findElement(By.linkText("Investing & Wealth")).click();
    }
        // to close
 //   @AfterMethod
    public static void tearDown(){
        driver.quit();
    }




}
