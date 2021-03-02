package from_TDBank;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingTDBank extends TDBankHome{

    @Test
    public void verifyTDBankHomePage() throws InterruptedException {
        TDBankHome.setUp();
        String expectedTitlePage = "TD Personal Banking, Loans, Cards & More | TD Bank";
        String actualTitlePage = driver.getTitle();
        Assert.assertEquals(actualTitlePage,expectedTitlePage,"Test failed");

    }
}
