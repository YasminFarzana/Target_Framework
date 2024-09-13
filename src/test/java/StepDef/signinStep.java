package StepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class signinStep extends config {
    @And("customer click on sign in button")
    public void customerClickOnSignInButton() {
        driver.findElement(By.xpath("//*[@id='listaccountNav-signIn']/a/span")).click();

    }

    @When("customer click on Sign in with password")
    public void customerClickOnSignInWithPassword() {
        driver.findElement(By.xpath("//*[@id='login']/span")).click();
        //driver.findElement(By.xpath("//*[@id='__next']/div/div/div/div[1]/div/div[2]/div/div/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"notNowButton\"]")).click();

    }

    @And("customer click maybe later button")
    public void customerClickMaybeLaterButton() {
        driver.findElement(By.xpath("//*[@id='__next']/div/div/div/div[1]/div/div[2]/button[2]")).click();
    }

    @Then("customer should be able to successfully login")
    public void customerShouldBeAbleToSuccessfullyLogin() {
        String exp="Fall Home Decor Ideas & Trends";
        String act=driver.findElement(By.xpath("//*[@id='pageBodyContainer']/div/div[1]/div/div/div[1]/div/div[1]/h1")).getText();
        Assert.assertEquals(act,exp);
    }
}
