package health_care.united_health_care;

import driver_info.DriverSelection;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

public class UHCHome extends DriverSelection {

    public static String url = "https://www.uhc.com/";
    public static String driverName = "edge";

    @BeforeMethod // set upping United Health Care Home page
    public static void homePageSerUp() throws InterruptedException {
        DriverSelection.driverSelection(driverName,url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
    }

        // click on find doctors button
    public static void clickOnFindDoctorsButton(){
//       driver.findElement(By.id("ip-close")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[2]/div[2]")).click();
    }

        // this method opened in a new window and I can't test it because my method page and
        // the new pages are in a different windows
    @Ignore
    public static void selectYourPlan() throws InterruptedException {
        UHCHome.clickOnFindDoctorsButton();
        driver.findElement(By.xpath("//*[@id=\"find-dr-top-box\"]/div[3]/div/button")).click();
        Thread.sleep(300);
        driver.findElement(By.cssSelector("#\\39 5653714-list > div > li:nth-child(1) > a")).click();

    }

        // this method is to click on the Medicare link
    public static void clickOnMedicare(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[1]/a")).click();
    }

       // again opening in a new window - like selectYourPlan method = will test is when I learn how
    @Ignore
    public static void forProviderLink(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div[1]/div[1]/div/div[1]/ul/li[2]/a")).click();
    }
        // a method to open an Employers link
    public static void forEmployersLink(){
        driver.findElement(By.cssSelector("div.aem-GridColumn.aem-GridColumn--default--9 > ul > li:nth-child(3) > a")).click();
    }
        // a method to open a contact us link under Footer page
    public static void contactUsFromFooter(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/footer/div/div/div/div[1]/div[2]/nav/ul/li[1]/a")).click();
    }
        // a method that will open a brokers and consultants link
    public static void forBrokersAndConsultants(){
        driver.findElement(By.cssSelector("div.aem-GridColumn.aem-GridColumn--default--9 > ul > li.ml-0.my-1.lg-my-0.lg-ml-3.lg-mr-2 > a")).click();
    }
    @Ignore  // I couldn't get a unique attribute for the search button
    public static void searchWithSearchBar(){
        // individual plans
        driver.findElement(By.cssSelector("#search-desktop")).sendKeys("individual plans");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[2]/div/form/div/button")).click();
    }

    public static void individualFamilyPlan(){
        driver.findElement(By.xpath("//*[@id=\"area-explore\"]/div[2]/div/div/div/div[1]/div/div/a")).click();
    }
        // a method to close an opened browser
    @AfterMethod
    public static void tearDown(){
        driver.quit();
    }
}
