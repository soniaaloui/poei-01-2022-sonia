package pageobject.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    By selecttitle = By.cssSelector("[data-autom='bag-header']");
    By selectProductName = By.cssSelector("[data-autom='bag-item-name']");
    By selectProductPrice = By.cssSelector(".rs-iteminfo-price");
    By selectSubTotal = By.cssSelector("[data-autom='bagrs-summary-subtotalvalue']");
    By selectTotal = By.cssSelector("[data-autom='bagtotalvalue']");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCartTitle(){
        return driver.findElement(selecttitle).getText();
    }

    public String getProductName(int index){
        return  driver.findElement(selectProductName).getText();
    }

    public String getProductPrice(int index){
        return  driver.findElement(selectProductPrice).getText();
    }

    public String getSubTotal(){
        return  driver.findElement(selectSubTotal).getText();


    }
    public String getTotal(){
        return  driver.findElement(selectTotal).getText();

    }
}
