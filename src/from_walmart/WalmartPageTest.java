package from_walmart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void verify() throws InterruptedException {
        WalmartPage.applyingFilterOnSearchResult();
        String expectedSearchedTitle = "Multicolor";
        String actualTitleFound = driver.findElement(By.xpath("//*[@id=\"SearchContainer\"]/div/div[4]/div[1]/div[1]/div[2]/div/div[2]/button")).getText();
        Assert.assertEquals(actualTitleFound,expectedSearchedTitle,"Test failed");
    }


}
