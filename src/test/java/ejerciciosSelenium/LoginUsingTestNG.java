package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginUsingTestNG {
    @Test
    public void loginWithValidCredentials() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement usernameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        usernameTxtBox.sendKeys("sofia");
        passwordTxtBox.sendKeys("rahulshettyacademy");
        signInBtn.click();


        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='logout-btn']")));


        WebElement successLogInTxt = driver.findElement(By.xpath("//h1"));
        System.out.println(successLogInTxt.getText());

        driver.quit();
    }

    @Test
    public void loginWithInvalidCredentials()  {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement usernameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        usernameTxtBox.sendKeys("sofia");
        passwordTxtBox.sendKeys("incorrecta");
        signInBtn.click();




        WebElement errorMsg = driver.findElement(By.xpath("//p[text()='* Incorrect username or password']"));
        System.out.println(errorMsg.getText());

        driver.quit();


    }

}
