package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioDeSesion extends Base{
    private By txtUser=By.xpath("//input[@name='userName']");
    private By contrasenia = By.xpath("//input[@name='password']");
    private By btnIngreso = By.xpath("//input[@name='submit']");
    private By login = By.xpath("//h3[.='Login Successfully']");
    public InicioDeSesion(WebDriver driver) {
        super(driver);
    }
    //Metodo iniciar sesion
    public void iniciarSesion(String usuario, String pass){
        findElement(txtUser).sendKeys(usuario);
        findElement(contrasenia).sendKeys(pass);
        findElement(btnIngreso).click();
    }
    public String mensajeLogin(){
        return findElement(login).getText();
    }


}
