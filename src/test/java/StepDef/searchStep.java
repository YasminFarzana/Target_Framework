package StepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class searchStep extends config {
    @And("Customer click in search icon")
    public void customerClickInSearchIcon() {
        driver.findElement(By.xpath("//*[@id='search']")).click();
    }

       @When("Customer type lunch box in search button")
    public void customerTypeLunchBoxInSearchButton() {
        driver.findElement(By.xpath("//*[@id='typeahead']/ul/li[5]/div/a/div/span[1]")).click();
    }


   }
