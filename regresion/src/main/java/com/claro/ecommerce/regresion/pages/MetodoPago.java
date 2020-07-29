package com.claro.ecommerce.regresion.pages;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;



public class MetodoPago extends PageObject {
	DatosPse pse = new DatosPse();
	DatosCodensa Codensa = new DatosCodensa();
	
	@FindBy(xpath="//*[@id=\"renewCheckoutButtons\"]/div/a")
	WebElement btnPagoFactura;
	
	@FindBy(xpath="//*[@id=\"tarjetasContent\"]/div")
	WebElement btnPse;
	
	@FindBy(xpath="//*[@id=\"tarjetasContent\"]/div[2]")
	WebElement btnCreditoDebito;
	
	@FindBy(xpath="//*[@id=\"tarjetasContent\"]/div[3]")
	WebElement btnCodensa;
	
	@FindBy(xpath="//*[@id=\"tarjetasContent\"]/div[4]/a")
	WebElement btnDaviplata;
	
	@FindBy(xpath="/html/body/div[1]/a[1]")
	WebElement btnAprobar;
	
	@FindBy(xpath="//*[@id=\"cuerpoResumenPedido\"]/p/span/span")
	WebElement validacion;

// metodo seleccionar tipo de pago
public void tipoDePago (List<String> tPago) throws InterruptedException {
	Thread.sleep(3000);
	switch (tPago.get(0)){
	case "factura":
		element(btnPagoFactura).click();
		Thread.sleep(6000);
		Serenity.takeScreenshot();
		//aprobar();
		break;
	case "pse":
		element (btnPse).click();
		Thread.sleep(6000);
		Serenity.takeScreenshot();
		//pse.diligenciarDatos(tPago);
		//aprobar();
		break;
	case "targeta":
		element(btnCreditoDebito).click();
		Thread.sleep(6000);
		Serenity.takeScreenshot();
		//aprobar();
		break;
	case "codensa":
		element(btnCodensa).click();
		Thread.sleep(6000);
		Serenity.takeScreenshot();
		//aprobar();
		break;
	case "daviplata":
		element(btnDaviplata).click();
		Thread.sleep(6000);
		Serenity.takeScreenshot();
		//aprobar();
		break;
	
	}
}
// metodo mockup aprobar	
public void aprobar () throws InterruptedException {
		Thread.sleep(6000);
		btnAprobar.click();
		Thread.sleep(3000);
		Serenity.takeScreenshot();
	}
	
	
	public void validarEstado (String dato) {
		assertEquals("test aprobado", validacion.getText());
		Serenity.takeScreenshot();
		
	}
	public void validarPago(String dato) {
		assertEquals("test aprobado", element (btnPagoFactura).isClickable());
	    Serenity.takeScreenshot();
	}
}
