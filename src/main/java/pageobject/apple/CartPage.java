package pageobject.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    By selecttitle = By.cssSelector("[data-autom='bag-header']");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getProductName(int index){

    }
}
