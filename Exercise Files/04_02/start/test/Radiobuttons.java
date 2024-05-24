import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\allan\\OneDrive - 3Cloud\\Desktop\\Ex_Files_Selenium_EssT\\Exercise Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.cssSelector("input#radio-button-1"));
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='option3']"));

        Thread.sleep(3000);
        radioButton3.click();
        Thread.sleep(3000);
        radioButton2.click();
        Thread.sleep(3000);
        radioButton1.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
