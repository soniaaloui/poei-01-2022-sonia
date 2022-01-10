import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.apple.*;

public class AppleTest {


    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/fr");
        driver.manage().window().maximize();

    }



    @Test
    public void IPhone13ProMax256GoBleuAlpinTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openIphonePage();


        IphonePage iphonePage = new IphonePage(driver);
        iphonePage.openIphone13ProPage();

        Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
        iphone13ProPage.buy();

        BuyIphone13ProPage buyIphone13ProPage = new BuyIphone13ProPage(driver);
        buyIphone13ProPage.selectPro13Max();
        buyIphone13ProPage.selectBlueAlpin();
        buyIphone13ProPage.select256Go();
        buyIphone13ProPage.noAppleTradIn();
        buyIphone13ProPage.addToCart();


        ConfirmationAddToCart confirmationAddToCart = new ConfirmationAddToCart(driver);
        confirmationAddToCart.openCartPage();


    }








   /* @AfterMethod
    public void teardown() {
        driver.quit();
    }*/


    //}
}
