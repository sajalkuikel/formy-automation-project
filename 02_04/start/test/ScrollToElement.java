import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Program Files/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name =  driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);

        actions.moveToElement(name);
        name.sendKeys("Sajal Kuikel");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("27/06/2022");
        Thread.sleep(2000);
        driver.quit();
    }
}
