package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement usernameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement sigInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        usernameTxtBox.sendKeys("sofia");
        passwordTxtBox.sendKeys("kdkdjks");


        sigInBtn.click();
        Thread.sleep(3000);

        WebElement errorMsg = driver.findElement(By.xpath("//p[text()='* Incorrect username or password']"));
        System.out.println(errorMsg.getText());

        driver.quit();
    }
}
