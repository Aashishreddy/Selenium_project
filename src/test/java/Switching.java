import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching {

    @Test
    public void switchToActiveWindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement buttonElement = driver.findElement(By.id("new-tab-button"));
        buttonElement.click();

        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
            Thread.sleep(1000);

        }
        driver.switchTo().window(originalHandle);

        driver.close();
    }

    @Test
    public void switchingToAlert(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertElement = driver.findElement(By.id("alert-button"));
        alertElement.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
