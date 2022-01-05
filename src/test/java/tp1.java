import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class tp1 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
        // Fermer cookies
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void test1() {
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.amazon.fr");
        //driver.manage().window().maximize();
        // Fermer cookies
        //Choisir name en deuxieme si id pas possible
        //driver.findElement(By.name("field-keywords"));
        //Choisir id en premier
        WebElement barreRecherche = driver.findElement(By.id("twotabsearchtextbox"));
        //Choisir cssSeLector en priorité par rapport a xpath
        //driver.findElement(By.cssSelector(""));
        //driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'"));
        //driver.findElement(By.xpath("//*[@name='field-keywords'"));
        //Pour envoyer les touches du clavier ( saisir la recherche)
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);


    }

    @Test
    public void test2() {

        //Choisir name en deuxieme si id pas possible
        //driver.findElement(By.name("field-keywords"));
        //Choisir id en premier
        WebElement barreRecherche = driver.findElement(By.id("twotabsearchtextbox"));
        //Choisir cssSeLector en priorité par rapport a xpath
        //driver.findElement(By.cssSelector(""));
        //driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'"));
        //driver.findElement(By.xpath("//*[@name='field-keywords'"));
        //Pour envoyer les touches du clavier ( saisir la recherche)
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);
        WebElement produit1 = driver.findElement(By.cssSelector("[cel_widget_id='MAIN-SEARCH_RESULTS-10']"));
        produit1.click();

        WebElement ajoutPanier = driver.findElement(By.cssSelector("[data-action='dp-pre-atc-declarative']"));
        ajoutPanier.click();

    }

    @Test
    public void testExplicitWait() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(By.id("nav-hamburger-menu")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".hmenu-item[data-menu-id='10']")));
        driver.findElement(By.cssSelector(".hmenu-item[data-menu-id='10']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul.hmenu-visible > li:nth-child(3)")));
        driver.findElement(By.cssSelector("ul.hmenu-visible > li:nth-child(3) > a")).click();

    }
}



