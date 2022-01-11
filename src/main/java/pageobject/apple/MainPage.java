package pageobject.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    WebDriver driver;

    int timeoutSearch = 10;
    By openIphonePageSelector = By.cssSelector(".ac-gn-link-iphone");


    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public IphonePage openIphonePage (){
        
        driver.findElement(openIphonePageSelector).click();

        IphonePage iphonePage = new IphonePage(driver);




      return iphonePage;
    }

}
