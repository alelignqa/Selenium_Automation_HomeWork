package driver_info;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSelection {
    public  static WebDriver driver;
    public static void driverSelection(String browserName, String url){

        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","browsers_driver/Windows/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
        } else if(browserName.equalsIgnoreCase("Fire Fox")){
            System.setProperty("webdriver.gecko.driver","browsers_driver/Windows/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(url);
        } else if(browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "browsers_driver/Windows/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get(url);
        }else if(browserName.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","browsers_driver/Windows/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.get(url);
        } else
            System.out.println("I don't have the browser you entered me");
    }
}
