import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));

        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        /*
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
        autocompleteResult.click();
        */
        driver.quit();
    }
}
