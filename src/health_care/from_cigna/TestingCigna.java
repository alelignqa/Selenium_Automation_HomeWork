package health_care.from_cigna;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingCigna extends  CignaHome{

    @Test
    public void verifyHomePage(){

        String expectedTitle = "Cigna Official Site | Global Health Service Company";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }

    @Test
    public void verifyCovidSearch() throws InterruptedException {
        covidSearch();
        String expectedText = "Displaying results for covid";
        String actuealText = driver.findElement(By.className("search-results__keyword")).getText();
        Assert.assertEquals(actuealText,expectedText,"Test faild");
    }

    @Test
    public void readSearchResult() throws InterruptedException {
        readFirstSearchResult();
        String expectedTitle = "Support for Families of Healthcare Workers Affected by COVID-19 | Cigna";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }
    @Test
    public void verifyIndividualsAndFamiliesPage(){
        individualsAndFamilies();
        String expectedTitle = "Individual and Family Health Insurance Plans | Cigna";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }

    @Test
    public void verifyMedicarPage(){
        medicare();
        String expectedTitle = "Cigna Medicare Insurance | Cigna";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }

 @Test
    public void verifyEmplorAndBrokers(){
        employersAndBrokers();
        String expectedTitle = "Employer Health Insurance Plans | Cigna";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }

@Test
    public void verifyhealthCareProvider(){
        healthCareProvider();
        String expectedTitle = "Health Care Providers | Cigna";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile,expectedTitle,"Test failed");
    }


}