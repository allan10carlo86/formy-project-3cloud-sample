
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement elementButton = driver.findElement(By.id("modal-button"));
        WebElement closeButton = driver.findElement(By.id("close-button"));
        elementButton.click();
        JavaScriptExecutor JSexecutor =  (JavaScriptExecutor)driver;
        Thread.sleep(3300);
        JSexecutor.executeScript("argument[0].click()", closeButton);

        driver.quit();
    }
}
