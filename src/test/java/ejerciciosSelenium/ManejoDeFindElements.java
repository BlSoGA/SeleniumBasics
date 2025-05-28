package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ManejoDeFindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> radioButton  = driver.findElements(By.xpath("//input[@class='radioButton']"));
        for (int i = 0; i < radioButton.size() ; i++) {
            radioButton.get(i).click();
        }
        List<WebElement> checkBox = driver.findElements(By.xpath("//fieldset//input[@type='checkbox']"));
        for (WebElement check : checkBox){
            check.click();
        }
        driver.quit();

    }

}
