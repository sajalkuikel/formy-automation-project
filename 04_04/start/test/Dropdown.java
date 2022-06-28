import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Program Files/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        Thread.sleep(1000);

        driver.quit();
    }
}
