import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:/Users/sapko/Desktop/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2024");
        dateField.sendKeys(Keys.RETURN);
        driver.quit();
    }
}