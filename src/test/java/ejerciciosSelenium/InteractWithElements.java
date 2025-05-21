package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new  ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();




        //WebElement showBtn = driver.findElement(By.id("show-textbox"));
        //showBtn.click();

        WebElement hideBtn = driver.findElement(By.xpath("//input[@id ='hide-textbox']"));
        WebElement showBtn = driver.findElement(By.xpath("//input[@id ='show-textbox']"));
        hideBtn.click();
        //Thread.sleep(1000);
        showBtn.click();
        //Thread.sleep(1000);
        hideBtn.click();
        //Thread.sleep(1000);
        showBtn.click();

        hideBtn.click();

        //Ejemplo de sendKeys();
        //1. Buscar Elemento
        WebElement countryTxtbox = driver.findElement(By.id("autocomplete"));
        //2. Escribir usando sendKeys ()
        countryTxtbox.sendKeys("Mexico");

        WebElement enterYourNameBox = driver.findElement(By.id("name"));
        enterYourNameBox.sendKeys("Sofia");

        //Thread.sleep(1000);
        //3. Borrar los TextBox
        enterYourNameBox.clear();
        countryTxtbox.clear();

        // COMANDOS GET
        //getTitle()
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        //pagina de SELENIUM https://www.selenium.dev/documentation/webdriver/browsers/chrome/

        //getText
        WebElement suggesionClass = driver.findElement(By.xpath("//legend[text() = 'Suggession Class Example']"));
        System.out.println(suggesionClass.getText());
        //COMANDOS CONDICIONALES
        //is Displayed
        WebElement hideshowTxtBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(hideshowTxtBox.isDisplayed());// devuelve un bool dependiendo de si se muestra o no
        // buscar radioButton1 y dar clic
        //verificar si está seleccionado con comando isSelected()
        //imprimir status

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value = 'radio1']"));
        radioButton1.click();
        System.out.println(radioButton1.isSelected()); //devuelve un bool si está activo o no
        Thread.sleep(1000);

        WebElement checkboxO2 = driver.findElement(By.xpath("//input[@value = 'option2']"));
        checkboxO2.click();
        System.out.println(checkboxO2.isSelected());
        Thread.sleep(1000);
        //Thread.sleep(5000);  //No se debe  hacer solo es por practicidad del curso
        driver.quit();







    }
}
