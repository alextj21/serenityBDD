package com.claro.ecommerce.regresion.pages;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class Login extends PageObject {

	
	@FindBy(name="logonId")
	WebElement txtCorreo;
	
	@FindBy(name="logonPassword")
	WebElement txtContrasena;
	
	@FindBy(xpath="//*[@id=\"Header_GlobalLogin_GlobalLogon\"]/div[5]/a/div[2]")
	WebElement btnIniciarSesion;
	
	@FindBy(id="Header_GlobalLogin_signOutQuickLinkUser")
	WebElement validacionAprobado;
	
	@FindBy(xpath="//*[@id=\"displayError\"]/h5")
	WebElement validacionFallida;
//metodo registro usuario y contraseña	
	public void iniciarSesion (List<String> datos) throws InterruptedException {
		txtCorreo.sendKeys(datos.get(0));
		Serenity.takeScreenshot();
		txtContrasena.sendKeys(datos.get(1));
		Serenity.takeScreenshot();	
	}
// metodo boton inicar sesion	
	public void clickInicion() throws InterruptedException {
		btnIniciarSesion.click();	
	}
// metodo validacion de inicio de sesion exitoso
	public void validacionEstado (List<String> datos) throws InterruptedException {
		validacionAprobado.getText().contains(datos.get(0));
		Serenity.takeScreenshot();
	}
// metodo validacion de inicio de sesion fallido
	public void validacionEstadoFallido(List<String> datos) {
		assertEquals("test aprobado", validacionFallida.getText(),datos.get(0));
	}
}

