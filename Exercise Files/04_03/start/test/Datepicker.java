import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datepicker = driver.findElement(By.id("datepicker"));

        datepicker.sendKeys("03/12/2020");
        Thread.sleep(3000);
        datepicker.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        driver.quit();
    }
}