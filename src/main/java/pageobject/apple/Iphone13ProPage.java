package pageobject.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphone13ProPage {

    WebDriver driver;
    By buySelector = By.cssSelector(".ac-ln-action-button");

    public Iphone13ProPage(WebDriver driver){
        this.driver = driver;
    }

    public BuyIphone13ProPage buy(){
        driver.findElement(buySelector).click();
        BuyIphone13ProPage buyIphone13ProPage = new BuyIphone13ProPage(driver);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return buyIphone13ProPage;


    }
}
