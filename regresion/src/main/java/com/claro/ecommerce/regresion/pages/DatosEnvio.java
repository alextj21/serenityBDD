package com.claro.ecommerce.regresion.pages;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DatosEnvio extends PageObject {

	@FindBy(name = "address1")
	WebElement txtDireccion;

	@FindBy(name = "address2")
	WebElement txtBarrio;

	@FindBy(xpath = "//*[@id=\"Register\"]/div/div[2]/div/div[3]/div/select/option")
	List<WebElement> droDowntlistDepartamento;

	@FindBy(xpath = "//*[@id=\"Register\"]/div/div[2]/div/div[4]/input")
	WebElement txtInformacion;

	@FindBy(xpath = "//*[@id=\"Register\"]/div/div[2]/div/div[3]/div[2]/div/select/option")
	List<WebElement> dropDwonlistCiudad;

	@FindBy(id = "WC_UserRegistrationAddForm_links_1")
	WebElement btnGuardar;

	@FindBy(xpath = "//*[@id=\"whoReceiveMe\"]")
	WebElement btnSeleccion;

	@FindBy(id = "whoReceiveOther")
	WebElement btnRecibe;

	@FindBy(xpath = "//*[@id=\"whoReceiveMe\"]")
	WebElement btnSeleccionarYo;

	@FindBy(xpath = "//*[@id=\"whoReceiveOther\"]")
	WebElement btnSeleccionarOtro;

	@FindBy(xpath = "//*[@id=\"whoReceiveName\"]")
	WebElement txtNombreAdicional;
	
	@FindBy(xpath = "//*[@id=\"Header_GlobalLogin_signOutQuickLinkUser\"]/text()[2]")
	WebElement validacion;
	
	@FindBy(name = "shopCartDisplayErrorToRegistryUser")
	WebElement validacionError;
	
	@FindBy(xpath = "//*[@id=\"chooseDeliveryDate\"]")
	WebElement opCalendario;
	
	@FindBy(xpath = "//*[@id=\"preferredDeliveryDate\"]/div[2]/div/div[1]/table/tbody/tr")
	List<WebElement> calendario;
	
	@FindBy(xpath = "//*[@id=\"continue_button_guest\"]")
	WebElement btnContinuarCompra;
	
	@FindBy(xpath = "//*[@id=\"Register\"]/div/div[2]/div/div[7]/p")
	WebElement validacionTexto;
	
	@FindBy(xpath = "//*[@id=\"page\"]")
	WebElement validarPagina;
	
	@FindBy(xpath="//*[@id=\"WC_BreadCrumbTrailDisplay_links_2a\"]/div[2]")
	WebElement btnRegresar;
	
	
// metodo lista departamento
	public void seleccionarDepartamento(List<String> dato) {
		for (int i = 0; i < droDowntlistDepartamento.size(); i++) {
			if (droDowntlistDepartamento.get(i).getText().contains(dato.get(9))) {
				droDowntlistDepartamento.get(i).click();

				break;
			}
		}
	}
// metodo lista ciudad
	public void seleccionarCiudad(List<String> dato) {
		for (int i = 0; i < dropDwonlistCiudad.size(); i++) {
			if (dropDwonlistCiudad.get(i).getText().contains(dato.get(10))) {
				dropDwonlistCiudad.get(i).click();

				break;
			}
		}
	}
// metodo seleccionar quien recibe el producto
	public void recibirProducto(List<String> dato) throws InterruptedException {
		if (dato.get(0).contains("yo")) {
			btnSeleccionarYo.click();
		} else if (dato.get(0).contains("otro")) {
			btnSeleccionarOtro.click();
			txtNombreAdicional.clear();
			txtNombreAdicional.sendKeys(dato.get(1));
		}
	}
// metodo diligenciar datos de envio
	public void llenarDatosDeEnvio(List<String> datos) throws InterruptedException {
		//Thread.sleep(3000);
		txtDireccion.click();
		//Thread.sleep(3000);
		txtDireccion.sendKeys(datos.get(7));
		//Thread.sleep(3000);
		txtBarrio.sendKeys(datos.get(8));
		//Thread.sleep(3000);
		seleccionarDepartamento(datos);
		//Thread.sleep(3000);
		seleccionarCiudad(datos);
		txtInformacion.sendKeys(datos.get(11));
	}
	public void llenarDatosAdicionales() {
		btnSeleccion.click();
	}

	public void clickBoton() {
		btnGuardar.click();
	}
	
	public void recibir() {
		btnSeleccionarYo.click();
	}
	public void seleccionarCalendario() {
		opCalendario.click();
	}
// metodo seleccionar dia habilitado calendario de entrega
	public void Calendario () {
			List<WebElement> days = new ArrayList<WebElement>();
			for (WebElement dato :calendario) {				
				for (WebElement td: dato.findElements(By.xpath(".//td"))) {
					if(td.getAttribute("class").contains("day") && !td.getAttribute("class").contains("disabled")) {
						days.add(td);
					}
				}				
			}
			Random rand = new Random();
			days.get(rand.nextInt(days.size())).click();
	}
		
	
	public void validarUsuario (List<String>dato) throws InterruptedException {
		assertEquals("test aprobado",validacion.getText().toString(),dato.get(0));
		Serenity.takeScreenshot();
		
	}
	public void error(List<String> dato) {
	validacionError.getText().contains(dato.get(0));
	}
	public void continuarCompra() throws InterruptedException {
		btnContinuarCompra.click();	
	}
// scroll finalizacion pagina	
	public void downPagina() {
		((org.openqa.selenium.JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView();",btnRegresar);
	}
}
