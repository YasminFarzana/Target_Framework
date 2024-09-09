package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.testng.Assert;

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
        driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div/div[1]/div/div/div[4]/div/div/div[1]/div[1]/div[3]/div/div/span")).click();
    }

    @And("customer click on pink backpack item")
    public void customerClickOnPinkBackpackItem() {
        driver.findElement(By.xpath("//*[@id=\"PdpImageGallerySection\"]/div[1]/div[1]/div/div/div/div/img")).click();
    }

    @And("customer add the item to cart")
    public void customerAddTheItemToCart() {
        driver.findElement(By.xpath("//*[@id=\"addToCartButtonOrTextIdFor84397991\"]")).click();
    }
}
