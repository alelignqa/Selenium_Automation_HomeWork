package from_walmart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WalmartPageTest extends WalmartPage{

    @Test
    public static void verifyWalmartLogo() throws InterruptedException {
        WalmartPage.verifyWalmartHomePage();
 //       boolean expected = true;
        boolean actual = driver.findElement(By.id("hf-home-link")).isDisplayed();
 //       Assert.assertEquals(actual,expected,"Test failed");  // I can also use as follows
        Assert.assertEquals(actual,true,"Test failed");

    }

    @Test(dependsOnMethods = "verifyWalmartLogo")
    public void verifySearchBarUse() throws InterruptedException {
        WalmartPage.searchWithSearchBar();
        String expectedSearchedTitle = "crayons - Walmart.com";
        String actualTitleFound = driver.getTitle();
        Assert.assertEquals(actualTitleFound,expectedSearchedTitle,"Test failed");
    }

    @Test()
    public void verifyFilterSelection() throws InterruptedException {
        WalmartPage.applyingFilterOnSearchResult();
        String expectedSearchedTitle = "Gift eligible";
        String actualTitleFound = driver.findElement(By.cssSelector("div:nth-child(2) > div > div.content > button")).getText();
        Assert.assertEquals(actualTitleFound,expectedSearchedTitle,"Test failed");
    }

    @Test()
    public void verifyAddingItemToCart() throws InterruptedException {
        WalmartPage.doAddItemToCart();
        String expectedSearchedTitle = " You just added 1 item";
        String actualTitleFound = driver.findElement(By.cssSelector("#pac-main-heading > div.Grid-col.u-size-6-12-m.heading-title.u-size-12-s > span:nth-child(1) > span")).getText();
         System.out.println(actualTitleFound);
        Assert.assertEquals(actualTitleFound,expectedSearchedTitle,"Test failed");
    }

@Test()  // this test keep failing it seems the expected is not considered as text
    public void verifyItemRemovedFromCart() throws InterruptedException {
        WalmartPage.removeItemFromCart();
        String expectedSearchedTitle = "Cart contains 0 items";
    //    String actualTitleFound = driver.findElement(By.id("hf-cart")).getText();
        String actualTitleFound = driver.findElement(By.cssSelector("#hf-cart > span > span > span.b_a.hf-bubble-button-icon-slide.b_g.b_b.b_p > img")).getText();
         System.out.println(actualTitleFound);
        Assert.assertEquals(actualTitleFound,expectedSearchedTitle,"Test failed");
    }




}
