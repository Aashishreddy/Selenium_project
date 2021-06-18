import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelectors {

    @Test
    public void cssSelectorTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASHISH REDDY\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com");

        //Parent to Child
        WebElement element = driver.findElement(By.cssSelector(".jumbotron-fluid h1"));
        String text = element.getText();
        System.out.println(text);

        /*
        CSS Selector class: "input.classname"
        CSS Selector id: "input#idname"
        CSS Selector type: "input[type = 'text']" or "input[value = ' ']"
         */

        // Nth Child
//        WebElement nthChild = driver.findElement(By.cssSelector(".jumbotron-fluid li a:4th-child(4)"));
//        nthChild.click();

        driver.quit();
        driver.close();
    }
}

