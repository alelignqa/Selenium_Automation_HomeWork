package from_TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TDBankHome {

    public static String url = "https://www.tdbank.com";
    public static WebDriver driver;
    public static String driverLocation = "browsers_driver/Windows/geckodriver.exe";
    public static String browserDriver;

    @BeforeMethod
    public static void setUp() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver",driverLocation);
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    public static void getOfferButton() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"ensCall\"]/span[2]")).click(); // to close the pop up window
        driver.findElement(By.cssSelector("a.td-button:nth-child(3)")).click();
    }

    public static void smallBusiness() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"ensCall\"]/span[2]")).click(); // to close the pop up window
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[2]/a")).click();
    }

    @Test
    public static void commercial() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"ensCall\"]/span[2]")).click(); // to close the pop up window
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a")).click();
    }

  @Test
    public static void investingAndWealth() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"ensCall\"]/span[2]")).click(); // to close the pop up window
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[4]/a")).click();
    }




}
