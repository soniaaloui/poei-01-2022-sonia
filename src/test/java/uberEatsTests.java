
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class uberEatsTests {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.ubereats.com/fr");
        //pour max la page
        driver.manage().window().maximize();
        //Fermer la fenetre cookies (cliquer sur accepter)
        WebElement buttonCookies = driver.findElement(new By.
                ByCssSelector("#cookie-banner button.bj"));
        buttonCookies.click();
    }

    @Test
    public void addBurgerToCart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Arrange

        // declaration de variables
        String keyword1 = "la defense";
        By searchBarSelector1 = By.cssSelector("[placeholder=\"Saisissez l'adresse de livraison.\"]");
        By searchBarSelector2 = By.cssSelector("[alt='Burgers']");
        By searchBarSelector3 = By.cssSelector("a[href='/fr/store/king-marcel-nanterre/07TTIgUiQPWyz4uq4_H35w'] > h3");
        By searchMenuSelector = By.cssSelector("[alt='Le Marcel Jackson']");
        By searchAjoutMenu = By.cssSelector(".spacer._24 + button.b8");
        By autocompleteSelector = By.cssSelector("#location-typeahead-home-menu > li");
        By cartSelector = By.cssSelector("button[aria-label='checkout'] > div");
        String expectedCartItems = "1";



        //Act
        //Barre de recherche et chercher un produit et clicker sur entrer apres l'apparition du premier resultat
        WebElement barreRecherche1 = driver.findElement(searchBarSelector1);
        barreRecherche1.sendKeys(keyword1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(autocompleteSelector));
        barreRecherche1.sendKeys(Keys.ENTER);


        //Choisir la categorie Burgers dans la section "Explorer par categorie"
        WebElement selectBurger = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBarSelector2));
        selectBurger.click();


        //Dans la liste de restaurants, ouvrir le restaurant "King Marcel" (4eme restaurant dans la liste)
        WebElement selectRestorant = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBarSelector3));
        selectRestorant.click();

        //Dans la liste de plats, ajouter le premier plat au panier
        WebElement selectMenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchMenuSelector));
        selectMenu.click();
        //Verifier que le Panier contient 1 produit
        WebElement ajoutBurgerPanier = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchAjoutMenu));
        ajoutBurgerPanier.click();


        //Assert
        WebElement cart = wait.until(
                ExpectedConditions.visibilityOfElementLocated(cartSelector));

        Assert.assertTrue(cart.getText().contains(expectedCartItems), "le panier est different de 1");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}







