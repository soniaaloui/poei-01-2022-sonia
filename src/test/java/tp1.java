import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tp1 {

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
        // Fermer cookies
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();
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

        //driver.quit();
        



    }
    @Test
    public void test2(){}
}
