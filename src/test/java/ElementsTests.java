import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementsTests {

    // add selenium-java-1.141.59 jar files present in selenium folder.
    @Test
    public void scrollTest(){

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement nameElement = driver.findElement(By.id("name"));
//       Actions action = new Actions();
////        action.move
        nameElement.sendKeys("Aashish Reddy");
//
        WebElement dateElement = driver.findElement(By.id("date"));
        dateElement.sendKeys("07/14/2021");
    }

    @Test
    public void swJUnitTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.swtestacademy.com/");

        assertEquals("Software Test Academy", driver.getTitle(), "Title check Failed!");

        driver.close();

        driver.quit();

    }

    @Test
    public void googleTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Aashish Reddy Vundhyala");

        element.submit();

    }

    @Test
    public void formyKeyPressTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement element = driver.findElement(By.id("name"));
        element.click();
        element.sendKeys("Akhil Reddy");

        WebElement elementButton = driver.findElement(By.id("button"));
        element.click();
    }

    @Test
    public void autocompleteTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement element = driver.findElement(By.id("autocomplete"));
        element.sendKeys("24689 Capecastle Terrace, Aldie, VA, USA");
        Thread.sleep(1000);   // to load for results

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

    }


}
