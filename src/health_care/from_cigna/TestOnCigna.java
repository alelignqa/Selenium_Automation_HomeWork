package health_care.from_cigna;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnCigna extends CignaHome{

    @Test
    public void verifyHomePage(){
        setUp();
        String expectedTitle = "Cigna Official Site | Global Health Service Company";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }

}
