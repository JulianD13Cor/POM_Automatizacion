package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {
    private WebDriver driver;
    public Base(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver conectorChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-020\\eclipse-workspace\\arquitectura3\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    // metodos wrapper - emboltorios
    //Metodo que devuelve el localizador
    public WebElement findElement(By localizador){
        return driver.findElement(localizador);
    }
    //Metodo que devuelve una lista de elemento
    public List<WebElement> findElements(By localizador){
        return driver.findElements(localizador);
    }
    //Metodo que devuelve el texto del elemento
    public String text(WebElement elemento){
        return elemento.getText();
    }
    //Metodo para hacer click
    public void click(By localizador){
        driver.findElement(localizador).click();
    }
    //Metodo para escribir texto
    public void escribirTexto(String input,By localizador){

        driver.findElement(localizador).sendKeys(input);
    }
    //Metodo para indicar si el elemento se puede usar
    public  Boolean isDisplayed(By localizador){
        try {
            return driver.findElement(localizador).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    //Metodo para abrir la pagina
    public void pagina(String url){
        driver.get(url);
    }




}
