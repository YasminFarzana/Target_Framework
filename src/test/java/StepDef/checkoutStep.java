package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class checkoutStep extends config {
    @And("customer type womens shoes in search edit box and click enter from search edit box")
    public void customerTypeWallDecorInSearchEditBoxAndClickEnterFromSearchEditBox() {
        driver.findElement(By.xpath("//*[@id='typeahead']/ul/li[3]/div/a/div/span[1]")).sendKeys("womens shoes");

    }



}
