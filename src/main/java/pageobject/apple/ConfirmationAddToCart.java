package pageobject.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationAddToCart {

    WebDriver driver;
    By selectConAddToCart = By.cssSelector("[data-autom='proceed']");

    public ConfirmationAddToCart(WebDriver driver){
        this.driver = driver;
    }

    public void openCartPage() {
        driver.findElement(selectConAddToCart).click();


    }
}
