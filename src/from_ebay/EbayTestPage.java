package from_ebay;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayTestPage extends EbayHome{

    @Test
    public void verifyEbayHomePage() throws InterruptedException {
        EbayHome.homePageSetUp();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifySearchBar() throws InterruptedException {
        EbayHome.searchItemWithSearchbar();
        String expectedTitle = "Phones | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifySamsungSelection() throws InterruptedException {
        EbayHome.selectBrandSamsungInPhonesSearch();
        String expectedTitle = "Samsung\n" + "Remove filter";
        String actualTitle = driver.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[1]/div/a")).getText();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifyMotorsSearch() throws InterruptedException {
        EbayHome.clickOnMotersLink();
        String expectedTitle = "eBay Motors: Auto Parts and Vehicles | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifyDailyDealsLink() throws InterruptedException {
        EbayHome.clickOnDailyDeals();
        String expectedTitle = "Daily Deals on eBay | Best deals and Free Shipping";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifyBrandOutletLink() throws InterruptedException {
        EbayHome.clickOnBrandOutlet();
        String expectedTitle = "Brand Outlet products for sale | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifyElectronicLink() throws InterruptedException {
        EbayHome.openElectronicsLink();
        String expectedTitle = "Electronics";
        String actualTitle = driver.findElement(By.cssSelector(".b-pageheader__text")).getText();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }







}
