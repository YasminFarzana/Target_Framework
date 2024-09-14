package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class checkoutStep extends config {
    @And("customer type womens shoes in search edit box and click enter from search edit box")
    public void customerTypeWallDecorInSearchEditBoxAndClickEnterFromSearchEditBox() {
        driver.findElement(By.xpath("//*[@id='typeahead']/ul/li[3]/div/a/div/span[1]")).sendKeys("womens shoes");

    }


    @And("customer type backpack in search edit box")
    public void customerTypeBackpackInSearchEditBox() {
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("backpack");
    }

    @And("customer click on search symbol")
    public void customerClickOnSearchSymbol() {
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button[2]")).click();
    }

    @And("customer able to see list of backpack in search result page")
    public void customerAbleToSeeListOfBackpackInSearchResultPage() {
        String exp="for “backpack”";
        String act=driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div/div[1]/div/div/div[4]/div/div/div[1]/div[1]/div[3]/div/div/span")).getText();
        Assert.assertEquals(act,exp);


    }


    @And("customer click at to cart laptop backpack")
    public void customerClickAtToCartLaptopBackpack() {
browseAndSelectproduct();
    }

    private void browseAndSelectproduct() {
        WebElement addToCartBtn=driver.findElement(By.id("addToCartButton")) ;
        addToCartBtn.click();
    }
}
