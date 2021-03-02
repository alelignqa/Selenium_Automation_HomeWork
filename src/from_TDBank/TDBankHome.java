package from_TDBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TDBankHome {

    public static String url = "https://www.td.com/us/en/personal-banking/";
    public static WebDriver driver;
    public static String driverLocation = "browsers_driver/Windows/chromedriver.exe";

    @Test
    public static void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",driverLocation);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

}
