import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
