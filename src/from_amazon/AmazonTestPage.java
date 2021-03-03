package from_amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestPage extends AmazonHome {

    @Test
    public void verifyHomePage() throws InterruptedException {
        AmazonHome.setUp();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test failed ");
    }
    @Test
    public void verifyItemSearched() throws InterruptedException {
        AmazonHome.searchForToys();
        String expectedItemOnThePage = "\"toys\"";
        String actualItemFound = driver.findElement(By.xpath(verifyItem)).getText();
        Assert.assertEquals(actualItemFound,expectedItemOnThePage,"Test failed");
    }
    @Test
    public void verifyBooksLink(){
        AmazonHome.booksLink();
        String expectedBookItem = "Amazon.com : sidney sheldon";
        String actcualBookItem = driver.getTitle();
        Assert.assertEquals(actcualBookItem, expectedBookItem,"Test failed");
    }
    @Test
    public void amazonCart(){
        AmazonHome.clickOnAmazonCart();
        String expectedTitle = "Amazon.com Shopping Cart";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test failed");
    }
    @Test
    public void verifySelectedBook() throws InterruptedException {
        AmazonHome.buyingBook();
        String expectedBook = "Master of the Game: Sheldon, Sidney: 9781478948438: Amazon.com: Books";
        String actualFound = driver.getTitle();

    }
}