import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu_Button = driver.findElement(By.id("dropdownMenuButton"));
        WebElement autocomplete_Selection = driver.findElement(By.id("autocomplete"));
        Thread.sleep(3000);
        dropdownMenu_Button.click();
        Thread.sleep(3000);

        autocomplete_Selection.click();
        Thread.sleep(3000);




        driver.quit();
    }
}
