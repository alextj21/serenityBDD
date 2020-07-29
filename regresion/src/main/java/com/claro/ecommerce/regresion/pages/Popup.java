package com.claro.ecommerce.regresion.pages;


import java.util.List;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class Popup extends PageObject {

	String Opcion = "";
	
	@FindBy(xpath = "//*[@id=\"signInContent\"]") 
	WebElement popup3;
	
	@FindBy(xpath = "//*[@id=\"replacePriceAvailablePopup\"]/div[2]") 
	WebElement popup;

	@FindBy(xpath = "//*[@id='financeAvailablePopup']/div[2]")
	WebElement popup1;

	@FindBy(xpath = "//*[@id=\"continueAdd2Cart\"]")
	WebElement btnAnadirCarrito;

	@FindBy(id = "continueAdd3Cart")
	WebElement btnPrepago1;
	
	@FindBy(id = "continueAdd3Cart4")
	WebElement btnPrepago2;
	
	@FindBy(xpath = "//*[@id=\"ja_btn_158531618200437583\"]/span")
	WebElement btnPrepago3;
	
	@FindBy(xpath = "//*[@id=\"WC_CheckoutLogonf_div_2\"]/div/a")
	WebElement btnregistro;

	@FindBy(xpath = "//*[@id=\"miClaroRedirect\"]")
	WebElement btnRenovacion;

	@FindBy(id = "miClaroRedirect2")
	WebElement btnFinanciamiento;
	
	@FindBy(xpath = "//*[@id=\"orderItemDisplay\"]/div[2]/span")
	WebElement txtProcesoCompra1;
	
	@FindBy(xpath = "//*[@id=\"orderItemDisplay\"]/div/span")
	WebElement txtProcesoCompra;
	
// metodo popup renovacion, compra directa, financiamiento
	public void tipoDeServicio(List<String> dato) throws InterruptedException {
		System.out.println("lugar" + "  " + dato.get(0).toString());

		switch (dato.get(0)) {
		case "celulares":
			
			 if (dato.get(1).toString().contains("directo")) {
			    registroCompra();
				Serenity.takeScreenshot(); 
				 
		     }else if (element (popup) .isEnabled ()) {
					Serenity.takeScreenshot();
					if (dato.get(1).toString().contains("carrito")) {
						setWaitForElementTimeout(5000);
						btnAnadirCarrito.click();
						Serenity.takeScreenshot();
						registroCompra();
						Serenity.takeScreenshot();
					} else if (dato.get(1).toString().contains("renovacion")) {
						btnRenovacion.click();
						Serenity.takeScreenshot();
						try {
							if(txtProcesoCompra1.getText().contains("Mi carrito")) {
			                    Serenity.takeScreenshot();
								registroCompra();
								Serenity.takeScreenshot();
								break;
								}
							
						} catch (Exception e) {
							if (element (popup3) .isEnabled ()) {
								Serenity.takeScreenshot();
								break;
							}
						}
						 
					}

				} 
			
			break;
		case "tecnologia":
			Thread.sleep(3000);
			
				 if (element (popup1) .isEnabled ()) {
					Serenity.takeScreenshot();
					
					if (dato.get(1).toString().contains("carrito")) {
						btnPrepago1.click();
						Serenity.takeScreenshot();
						registroCompra();
						Serenity.takeScreenshot();
						
					} else if (dato.get(1).toString().contains("financiacion")) {
						btnFinanciamiento.click();
						Serenity.takeScreenshot();
						btnPrepago2.click();
						Serenity.takeScreenshot();
						btnPrepago3.click();
						Serenity.takeScreenshot();
					}
				}
			break;
		case "moviles":
				if (dato.get(1).toString().contains("directo")) {
						registroCompra();
						Serenity.takeScreenshot();
						
					}else if (element (popup) .isEnabled ()) {
				        Serenity.takeScreenshot();
					    Thread.sleep(3000);
					if (dato.get(1).toString().contains("carrito")) {
						btnAnadirCarrito.click();
						Serenity.takeScreenshot();
						registroCompra();
						Serenity.takeScreenshot();
					}else if (dato.get(1).toString().contains("renovacion")) {
						btnRenovacion.click();
						btnRenovacion.click();
						Serenity.takeScreenshot();
						registroCompra();
						Serenity.takeScreenshot();
					}  
				   }
			break;

		default:
			break;
		}
	}

	
 			
public void validarRenovacion() {
		try {
			if (txtProcesoCompra.getText().contains("Proceso de compra")) {
				Serenity.takeScreenshot();	
			} 
		} catch (Exception e) {
			
			if(element (popup) .isEnabled ()) {
				btnRenovacion.click();
				Serenity.takeScreenshot();
				btnregistro.click();
				Serenity.takeScreenshot();
			}
		}	
}
// metodo boton renovacion	
	public void renovacion() {
		btnRenovacion.click();
		Serenity.takeScreenshot();
	}
// metodo seleccionar boton compra
	public void registroCompra() throws InterruptedException {
		Thread.sleep(9000);
		element (btnregistro).click();
		Serenity.takeScreenshot();
	}
}


