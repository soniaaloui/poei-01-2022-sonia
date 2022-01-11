package pageobject.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BuyIphone13ProPage {

    WebDriver driver;
    By select256Max = By.cssSelector("[data-autom='dimensionCapacity256gb'] + label");
    By selectNoTradln = By.cssSelector("[data-autom='choose-noTradeIn'] + label");
    By selectColor = By.cssSelector("[data-autom='dimensionColorsierrablue'] + label");
    By selectProMax = By.cssSelector("[data-autom='dimensionScreensize6_7inch'] + label");
    By selectCart = By.cssSelector("[data-autom='add-to-cart']");
    int timesearch = 10;
    int timeesearch = 5;
    int timepro = 5;




    public BuyIphone13ProPage(WebDriver driver){
        this.driver = driver;
    }

    public BuyIphone13ProPage selectPro13Max(){
        driver.findElement(selectProMax).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timepro));
        wait.until(ExpectedConditions.elementToBeClickable(selectColor));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;

    }
    public BuyIphone13ProPage selectBlueAlpin(){
        driver.findElement(selectColor).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timepro));
        wait.until(ExpectedConditions.elementToBeClickable(select256Max));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  this;

    }

    public BuyIphone13ProPage select256Go(){
        driver.findElement(select256Max).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timepro));
        wait.until(ExpectedConditions.elementToBeClickable(selectNoTradln));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  this;

    }

    public BuyIphone13ProPage noAppleTradIn(){
        driver.findElement(selectNoTradln).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timesearch));
        wait.until(ExpectedConditions.elementToBeClickable(selectCart));

        return this;
    }

    public ConfirmationAddToCart addToCart(){
        driver.findElement(selectCart).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ConfirmationAddToCart confirmationAddToCart = new ConfirmationAddToCart(driver);

        return confirmationAddToCart ;

    }


}
