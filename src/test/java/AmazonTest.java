import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {
    WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://www.amazon.fr");
            driver.manage().window().maximize();
            // Fermer cookies
             driver.findElement(By.id("sp-cc-accept")).click();
        }
        @AfterMethod
        public void teardown() {
            driver.quit();
        }

    @Test
    public void nintendoSwitchToCartPriceTest() {

        //Arrange
        String productName = "Nintendo Switch oled";

        //ACT
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct(productName);

        //Assert
    }
        @Test
        public void machineARaclette(){
            //Arrange
            String productName = "Machine a raclette";

            //ACT
            MainPage mainPage = new MainPage(driver);
            mainPage.searchProduct(productName);

        }


    }


