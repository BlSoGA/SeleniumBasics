package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;


public class InteractWithElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new  ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();




//        //WebElement showBtn = driver.findElement(By.id("show-textbox"));
//        //showBtn.click();
//
//        WebElement hideBtn = driver.findElement(By.xpath("//input[@id ='hide-textbox']"));
//        WebElement showBtn = driver.findElement(By.xpath("//input[@id ='show-textbox']"));
//        hideBtn.click();
//        //Thread.sleep(1000);
//        showBtn.click();
//        //Thread.sleep(1000);
//        hideBtn.click();
//        //Thread.sleep(1000);
//        showBtn.click();
//
//        hideBtn.click();
//
//        //Ejemplo de sendKeys();
//        //1. Buscar Elemento
//        WebElement countryTxtbox = driver.findElement(By.id("autocomplete"));
//        //2. Escribir usando sendKeys ()
//        countryTxtbox.sendKeys("Mexico");
//
//        WebElement enterYourNameBox = driver.findElement(By.id("name"));
//        enterYourNameBox.sendKeys("Sofia");
//
//        //Thread.sleep(1000);
//        //3. Borrar los TextBox
//        enterYourNameBox.clear();
//        countryTxtbox.clear();
//
//        // COMANDOS GET
//        //getTitle()
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        //System.out.println(driver.getPageSource());
//        //pagina de SELENIUM https://www.selenium.dev/documentation/webdriver/browsers/chrome/
//
//        //getText
//        WebElement suggesionClass = driver.findElement(By.xpath("//legend[text() = 'Suggession Class Example']"));
//        System.out.println(suggesionClass.getText());
//        //COMANDOS CONDICIONALES
//        //is Displayed
//        WebElement hideshowTxtBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//        System.out.println(hideshowTxtBox.isDisplayed());// devuelve un bool dependiendo de si se muestra o no
//        // buscar radioButton1 y dar clic
//        //verificar si está seleccionado con comando isSelected()
//        //imprimir status
//
//        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value = 'radio1']"));
//        radioButton1.click();
//        System.out.println(radioButton1.isSelected()); //devuelve un bool si está activo o no
//        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value = 'radio2']"));
//        radioButton2.click();
//        System.out.println("radio button 1 is selected? "+radioButton1.isSelected());
//        //Thread.sleep(1000);
//
//        TAREA OPCIONAL 1
//        WebElement checkboxO2 = driver.findElement(By.xpath("//input[@value = 'option2']"));
//        checkboxO2.click();
//        System.out.println(checkboxO2.isSelected());
//        WebElement checkbox01= driver.findElement(By.xpath("//input[@value = 'option1']"));
//        checkbox01.click();
//        System.out.println("checkbox 1 is selected?"+checkbox01.isSelected());
//        checkbox01.click();
//        System.out.println("checkbox 1 is selected?"+checkbox01.isSelected());
//
//         Buscar boton de Alert
 //         dar clic

//        WebElement alertBtn = driver.findElement(By.xpath("//input[@id='alertbtn']"));
//        alertBtn.click();
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();

        //buscar confirm por xpath
        //click en boton de confirm
        //aceptar la alerta
        //click boton en confirm
        //declinar alerta
//        WebElement confrimBtn = driver.findElement(By.xpath("//input [@id = 'confirmbtn']"));
//        confrimBtn.click();
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
//        confrimBtn.click();
//        Thread.sleep(1000);
//        driver.switchTo().alert().dismiss();
//        Thread.sleep(1000);
//
         //TAREA

        WebElement enterYourName = driver.findElement(By.xpath(("//input[@id='name']")));
        enterYourName.sendKeys("Sofia");
        WebElement confirmBtnE = driver.findElement(By.xpath("//input [@id = 'confirmbtn']"));
        confirmBtnE.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        enterYourName.sendKeys("Soa");
        WebElement alertBtn = driver.findElement(By.xpath("//input[@id = 'alertbtn']"));
        alertBtn.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);







//        //Manejo de DROPDOWN
//        //1. Buscar el dropdown
//        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//        Select select = new Select(dropdown);
//        //Buscar por index
//        select.selectByIndex(0);
//        Thread.sleep(1000);
//        //Buscar por value
//        select.selectByValue("option3");
//        Thread.sleep(1000);
//        //Buscar por texto visible
//        select.selectByVisibleText("Option2");
//        Thread.sleep(1000);
//
//        //USO DE LA CLASE ACTIONS
//        //MOUSE HOVER
//        WebElement mouseHoverBtn = driver.findElement(By.xpath("//button[@id = 'mousehover' ]"));
//        Actions actions = new Actions(driver);
//        //mover al elemento 'iFrame Example'
//        WebElement iFramelbl = driver.findElement((By.xpath("//legend[text()= 'iFrame Example']")));
//        actions.moveToElement(iFramelbl).contextClick(mouseHoverBtn).build().perform(); //el build() es para cuando hay varios elementos
//        //actions.moveToElement(mouseHoverBtn).perform();
//        Thread.sleep(1000);

//        //CLICK DERECHO
//        actions.contextClick(mouseHoverBtn).perform();
//        Thread.sleep(1000);

        //USO DEL findElementssssss
        List<WebElement> encabezados = driver.findElements(By.xpath("//table[@name = 'courses']//th"));
        for (int i = 0; i < encabezados.size() ; i++) {
            System.out.println(encabezados.get(i).getText());
        }
        for(WebElement encabezado : encabezados){
            System.out.println(encabezado.getText());
        }
        //Tarea dar click a todos los botones select box con iteraciones
        //clase nueva
        //using find elements








        //Thread.sleep(1000);
        //Thread.sleep(5000);  //No se debe  hacer solo es por practicidad del curso
        driver.quit();







    }
}
