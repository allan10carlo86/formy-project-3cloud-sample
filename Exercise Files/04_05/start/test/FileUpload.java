import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUpload_TextField = driver.findElement(By.id("file-upload-field"));
        fileUpload_TextField.sendKeys("C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\04_05\\start\\test\\file-to-upload.png");
        Thread.sleep(3000);
        driver.quit();
    }
}
