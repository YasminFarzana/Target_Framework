package StepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class searchStep extends config {
    @And("customer click in search icon and type Lunch box")
    public void customerClickInSearchIcon() {

        driver.findElement(By.xpath("//*[@id='search']")).sendKeys("Lunch box");

    }


    @When("customer enter search icon after type")
    public void customerEnterSearchIconAfterType() {
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button[2]")).click();
    }


    @Then("Customer able to see list of Lunch box in search result page")
    public void customerAbleToSeeListOfLunchBoxInSearchResultPage() {

  String exp="\"Lunch box\"";
  String act= driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div/div[1]/div/div/div[4]/div/div/div[1]/div[1]/div[3]/div/div/span")).getText();
  Assert.assertEquals(act, exp);

  String actual=driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div/div[1]/div/div/div[4]/div/div/div[1]/div[1]/div[3]/div/div/span")).getText();
  String number=actual.replaceAll("\\D+","");
  int item=Integer.parseInt(number);
  Assert.assertTrue(item> 0);
    }
}



