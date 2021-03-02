package from_TDBank;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingTDBank extends TDBankHome{

    @Test
    public void verifyTDBankHomePage() throws InterruptedException {
        TDBankHome.setUp();
        String expectedTitlePage = "TD Personal Banking, Loans, Cards & More | TD Bank";
        String actualTitlePage = driver.getTitle();
        Assert.assertEquals(actualTitlePage, expectedTitlePage, "Test failed");
    }

    @Test
    public void verifyOfferLink() throws InterruptedException {
        TDBankHome.getOfferButton();
        String expectedTitlePage = "Checking & Savings Account Offers";
        String actualTitlePage = driver.getTitle();
        Assert.assertEquals(actualTitlePage, expectedTitlePage, "Test failed");
    }

    @Test
    public void verifySmallBusiness() throws InterruptedException {
        TDBankHome.smallBusiness();
        String expectedTitlePage = "Small Business Banking by TD Bank";
        String actualTitlePage = driver.getTitle();
        Assert.assertEquals(actualTitlePage, expectedTitlePage, "Test failed");
    }

    @Test
    public void verifyCommercial() throws InterruptedException {
        TDBankHome.commercial();
        String expectedTitlePage = "TD Commercial Business Banking";
        String actualTitlePage = driver.getTitle();
        Assert.assertEquals(actualTitlePage, expectedTitlePage, "Test failed");
    }

 @Test
    public void verifyInvestingWealth() throws InterruptedException {
        TDBankHome.investingAndWealth();
        String expectedTitlePage = "Wealth & Investment Management And Financial Planning | TD Wealth";
        String actualTitlePage = driver.getTitle();
        Assert.assertEquals(actualTitlePage, expectedTitlePage, "Test failed");
    }


}
