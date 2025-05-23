package Test.Java;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CreateListTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void createList() {
        // Test name: Create List
        // Step # | name | target | value | comment
        // 1 | open | /app/MyLists |  |
        driver.get("https://www.newrecruit.eu/app/MyLists");
        // 2 | setWindowSize | 968x1012 |  |
        driver.manage().window().setSize(new Dimension(968, 1012));
        // 3 | click | css=.mobilePadding > .imageBouton |  |
        driver.findElement(By.cssSelector(".mobilePadding > .imageBouton")).click();
        // 4 | mouseOver | css=.mobilePadding > .imageBouton |  |
        {
            WebElement element = driver.findElement(By.cssSelector(".mobilePadding > .imageBouton"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 5 | mouseOut | css=.mobilePadding > .imageBouton |  |
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        // 6 | click | css=input:nth-child(4) |  |
        driver.findElement(By.cssSelector("input:nth-child(4)")).click();
        // 7 | click | css=.mobilePadding > .imageBouton |  |
        driver.findElement(By.cssSelector(".mobilePadding > .imageBouton")).click();
        // 8 | click | css=input:nth-child(4) |  |
        driver.findElement(By.cssSelector("input:nth-child(4)")).click();
        // 9 | type | css=input:nth-child(4) | 700 |
        driver.findElement(By.cssSelector("input:nth-child(4)")).sendKeys("700");
        // 10 | mouseDownAt | css=.newListSave > .bouton | 43,25.5 |
        {
            WebElement element = driver.findElement(By.cssSelector(".newListSave > .bouton"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        // 11 | mouseMoveAt | css=.newListSave > .bouton | 43,25.5 |
        {
            WebElement element = driver.findElement(By.cssSelector(".newListSave > .bouton"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 12 | mouseUpAt | css=.newListSave > .bouton | 43,25.5 |
        {
            WebElement element = driver.findElement(By.cssSelector(".newListSave > .bouton"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        // 13 | click | css=.newListSave > .bouton |  |
        driver.findElement(By.cssSelector(".newListSave > .bouton")).click();
        // 14 | click | css=.inbox:nth-child(3) .plusIcon |  |
        driver.findElement(By.cssSelector(".inbox:nth-child(3) .plusIcon")).click();
        // 15 | click | css=.unselectable:nth-child(2) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(2) .unselectable > span")).click();
        // 16 | click | css=.unselectable:nth-child(2) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(2) .unselectable > span")).click();
        // 17 | click | css=.unselectable:nth-child(3) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(3) .unselectable > span")).click();
        // 18 | click | css=.scrollable > .imgBt |  |
        driver.findElement(By.cssSelector(".scrollable > .imgBt")).click();
        // 19 | click | css=.inbox:nth-child(4) .plusIcon |  |
        driver.findElement(By.cssSelector(".inbox:nth-child(4) .plusIcon")).click();
        // 20 | click | css=.unselectable:nth-child(1) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(1) .unselectable > span")).click();
        // 21 | click | css=.unselectable:nth-child(1) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(1) .unselectable > span")).click();
        // 22 | click | css=.unselectable:nth-child(2) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(2) .unselectable > span")).click();
        // 23 | click | css=.unselectable:nth-child(3) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(3) .unselectable > span")).click();
        // 24 | click | css=.unselectable:nth-child(3) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(3) .unselectable > span")).click();
        // 25 | click | css=.unselectable:nth-child(4) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(4) .unselectable > span")).click();
        // 26 | click | css=.unselectable:nth-child(4) .unselectable > span |  |
        driver.findElement(By.cssSelector(".unselectable:nth-child(4) .unselectable > span")).click();
        // 27 | click | css=.scrollable > .imgBt |  |
        driver.findElement(By.cssSelector(".scrollable > .imgBt")).click();
        // 28 | click | css=.unitRow:nth-child(7) .actions:nth-child(3) > img |  |
        driver.findElement(By.cssSelector(".unitRow:nth-child(7) .actions:nth-child(3) > img")).click();
        // 29 | click | css=.min400 > .min700 |  |
        driver.findElement(By.cssSelector(".min400 > .min700")).click();
        // 30 | click | css=.exports > .imgBt:nth-child(1) |  |
        driver.findElement(By.cssSelector(".exports > .imgBt:nth-child(1)")).click();
        // 31 | click | css=.close |  |
        driver.findElement(By.cssSelector(".close")).click();
    }
}
