import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.apple.*;

import java.net.MalformedURLException;
import java.net.URL;

public class AppleTest {


    WebDriver driver;


    @BeforeMethod
    public void setup() {
        /*URL seleniumGridUrl = null;
        try {
            seleniumGridUrl = new URL("http://127.0.0.1:4444");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(seleniumGridUrl, chromeOptions);*/
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/fr");
        driver.manage().window().maximize();

    }



    @Test
    public void IPhone13ProMax256GoBleuAlpinTest(){

        String exceptPrice = "1 379,00";
        String exceptproductName = "iPhone 13 Pro Max 256 Go Bleu Alpin";
        String excepttitle = "Le montant total de votre Panier est de 1 379,00";

        String exceptsubTotal = "Sous-total";
        String excepttotalPrice = "Votre total";


        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = mainPage.openIphonePage().openIphone13ProPage()
                .buy()
                .selectPro13Max()
                .selectBlueAlpin()
                .select256Go()
                .noAppleTradIn()
                .addToCart()
                .openCartPage();


        /*IphonePage iphonePage = new IphonePage(driver);
        iphonePage.openIphone13ProPage();-------*/

        /*Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
        iphone13ProPage.buy() -------------/;

        BuyIphone13ProPage buyIphone13ProPage = new BuyIphone13ProPage(driver);
        buyIphone13ProPage.selectPro13Max();
        buyIphone13ProPage.selectBlueAlpin();
        buyIphone13ProPage.select256Go();
        buyIphone13ProPage.noAppleTradIn();
        buyIphone13ProPage.addToCart();


        ConfirmationAddToCart confirmationAddToCart = new ConfirmationAddToCart(driver);
        confirmationAddToCart.openCartPage();*/

        //CartPage cartPage = new CartPage(driver);

       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String ProductName = cartPage.getProductName(0);
        String CarTitle = cartPage.getCartTitle();
        String ProductPrice = cartPage.getProductPrice(0);
        String SubTotal = cartPage.getSubTotal();
        String Total = cartPage.getTotal();*/

        //Assert
//System.out.println(ProductPrice);


        /*Assert.assertTrue(ProductPrice.contains(exceptPrice), "the price is not the same");
        Assert.assertEquals(ProductName, exceptproductName);
        System.out.println(excepttitle);

        Assert.assertTrue(CarTitle.contains(excepttitle),"le titre n'est pas le meme");
        Assert.assertTrue(SubTotal.contains(exceptPrice));
        Assert.assertTrue(Total.contains(exceptPrice),"the total price not the same");*/

    }
   /* @Test
    public void passedTest() {
        MainPage mainPage = new MainPage(driver);

        Assert.assertTrue(true);
    }*/

   /* @AfterMethod
    public void teardown() {
        driver.quit();
    }*/


    //}
}
