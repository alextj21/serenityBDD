package com.claro.ecommerce.regresion.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DatosPersonales extends PageObject {

	@FindBy(xpath="//*[@id=\"details-button\"]")
	WebElement btnAvanzada;
	
	@FindBy(name="logonId")
	WebElement TxtCorreo;
	
	@FindBy(name="firstName")
	WebElement txtNombre;
	
	@FindBy(name="lastName")
	WebElement txtApellido;
	
	@FindBy(name="phone1")
	WebElement txtNumeroTel;
	
	@FindBy(name="phone2")
	WebElement txtNumeroTelAdicional;
	
	@FindBy(xpath="//*[@id=\"WC_UserRegistrationAddForm_FormInput_documentType_In_Register_1\"]")
	List<WebElement> droDowntlistTipoDocumento;
	
	@FindBy(name="documentNumber")
	WebElement txtNumDocu;
	
	@FindBy(xpath="//*[@id='Header_GlobalLogin_signOutQuickLinkUser']/text()[2]")
	WebElement validacion;
	
	@FindBy(xpath="//a[contains(text(),'Continuar')]")
	WebElement btnRegistro;
	
	
	public void botonAcceso() {
		btnAvanzada.click();
	}

//metodo lista tipo documento
	public void seleccionarDocumento(List<String> dato) {
		for (int i = 0; i< droDowntlistTipoDocumento.size(); i++) {
			if (droDowntlistTipoDocumento.get(i).getText().contains(dato.get(5))) {
				droDowntlistTipoDocumento.get(i).click();
				break;
			}
		}
	}
//metodo diligenciar datos personales
	public void LlenarDatosPersonales (List<String> datos) throws InterruptedException {
		//Thread.sleep(3000);
		TxtCorreo.sendKeys(datos.get(0));
		//Thread.sleep(3000);
		seleccionarDocumento(datos);
		//Thread.sleep(3000);
		txtNumDocu.sendKeys(datos.get(5));
		//Thread.sleep(3000);
		txtNombre.sendKeys(datos.get(1));
		//Thread.sleep(3000);
		txtApellido.sendKeys(datos.get(2));
		//Thread.sleep(3000);
		txtNumeroTel.sendKeys(datos.get(3));
		txtNumeroTelAdicional.sendKeys(datos.get(6));
		
	}
	public void validarSesion(List<String>dato) throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("test aprobado", validacion.getText().toString(),dato.get(0));
	}
	public void registrar() {
		btnRegistro.click();
	}
}
