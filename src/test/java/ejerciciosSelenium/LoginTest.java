package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement usernameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        usernameTxtBox.sendKeys("sofia");
        passwordTxtBox.sendKeys("rahulshettyacademy");
        signInBtn.click();

        Thread.sleep(4000);

        WebElement successLogInTxt = driver.findElement(By.xpath("//h1"));
        System.out.println(successLogInTxt.getText());

        driver.quit();
    }

}
