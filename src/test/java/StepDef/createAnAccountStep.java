package StepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class createAnAccountStep extends config {
//Faker f= new Faker();
    @Given("customer at Target Homepage")
    public void customerTargetHomepage() {
        String exp="Target : Expect More. Pay Less.";
        String act=driver.getTitle();
        Assert.assertEquals(act, exp);
        }

        @And("customer click on Sign in link in the corner of this page")
        public void customerClickOnSignInLinkInTheCornerOfThisPage() {
            driver.findElement(By.xpath("//*[@id='headerPrimary']/a[4]/span")).click();
        }

        @And("customer click on create an account button")
        public void customerClickOnCreateAnAccountButton() {
            driver.findElement(By.xpath("//*[@id='listaccountNav-createAccount']/a/span")).click();
        }

        @And("customer enter their valid email address")
        public void customerEnterTheirValidEmailAddress() {
        //String random=f.internet().emailAddress();
            driver.findElement(By.xpath("//*[@id='username']")).sendKeys("motaleb564@gmail.com");
        }

        @And("customer enter their firstname")
        public void custmerEnterTheirFirstname() {
            driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Motaleb");
        }

        @And("customer enter their lastname")
        public void custmerEnterTheirLastname() {
            driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Hossain");
        }

        @And("customer enter their mobile number")
        public void customerEnterTheirMobileNumber() {
            driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("(929)343-4534");
        }

        @And("customer enter their create password")
        public void customerEnterTheirCreatePassword() {
            driver.findElement(By.xpath("//*[@id='password']")).sendKeys("F123456@");
        }

        @And("customer click in Keep me sign in check box")
        public void customerClickInKeepMeSignInCheckBox() {
            driver.findElement(By.xpath("//*[@id='keepMeSignedIn']")).click();
        }

        @When("customer click on create account")
        public void customerClickOnCreateAccount() {

        driver.findElement(By.xpath("//*[@id='createAccount']")).click();
        driver.findElement(By.xpath("//*[@id='notNowButton']")).click();
        driver.findElement(By.xpath("//*[@id='join-button']")).click();
        }


    @Then("customer should be able to successfully signup")
    public void customerShouldBeAbleToSuccessfullySignup() {
        String exp="We’re so happy you’re a Target Circle member!";
        String act=driver.findElement(By.xpath("//*[@id='__next']/div/div/div/div/div/div/span/p")).getText();
        Assert.assertEquals(act,exp);
        driver.findElement(By.xpath("//*[@id='continue-shopping-link']")).click();
    }
}

