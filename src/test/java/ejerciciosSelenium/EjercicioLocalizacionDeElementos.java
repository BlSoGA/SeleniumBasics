package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EjercicioLocalizacionDeElementos {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Busqueda por id
        WebElement idSwitchWindowExample = driver.findElement(By.id("openwindow"));
        WebElement idSwitchToAlertEE = driver.findElement(By.id("name"));
        WebElement idSwitchToAlertEA = driver.findElement(By.id("alertbtn"));
        WebElement idSwitchtoAlertEC = driver.findElement(By.id("confirmbtn"));
        WebElement idSwitchTabExample = driver.findElement(By.id("opentab"));
        WebElement idElementDisplayedEH = driver.findElement(By.id("hide-textbox"));
        WebElement idElementDisplayedES = driver.findElement(By.id("show-textbox"));
        WebElement idElementDisplayedHS = driver.findElement(By.id("displayed-text"));

        //Busqueda por name
        WebElement nameSwitchToAlert = driver.findElement(By.name("enter-name"));
        WebElement nameElementDisplayed = driver.findElement(By.name("show-hide"));

        //Busqueda poor className
        List<WebElement> classNameRadioButtons = driver.findElements(By.className("radioButton"));

        //Busqueda por linkText o Partial Link Text
        WebElement linkText1 = driver.findElement(By.partialLinkText("QA Meetup "));
        WebElement linkText2 = driver.findElement(By.linkText("REST API"));
        WebElement linkText3 = driver.findElement(By.linkText("BrokenLink"));

    }
}
