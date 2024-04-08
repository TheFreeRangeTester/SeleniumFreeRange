package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Inicializa el WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        // Navega a la página web
        driver.get("https://www.freerangetesters.com");
        // Encuentra un elemento utilizando su ID
        WebElement elementoPorId = driver.findElement(By.id("ElementoLoco"));
        elementoPorId.click();

    }

    @Test
    public void test2() {
        // Navega a la página web
        driver.get("https://www.freerangetesters.com");
        // Encuentra un elemento utilizando su ID
        WebElement elementoPorId = driver.findElement(By.id("idDelElemento"));
        elementoPorId.click();

    }

    @Test
    public void test3() {
        // Navega a la página web
        driver.get("https://www.freerangetesters.com");
        // Encuentra un elemento utilizando su ID
        WebElement elementoPorId = driver.findElement(By.id("idDelElemento"));
        elementoPorId.click();

    }

    @AfterMethod
    public void tearDown() {
        // Cierra el navegador después de la prueba
        if (driver != null) {
            driver.quit();
        }
    }
}
