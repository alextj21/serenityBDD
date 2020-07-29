package com.claro.ecommerce.regresion.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DatosCodensa extends PageObject{

	@FindBy(id="NUMERO_TARJETA")
	WebElement txtNumTargeta;
	
	@FindBy(id="FECHA_VENC_MES")
	List<WebElement> listMesVencimiento;
	
	@FindBy(id="FECHA_VENC_ANNO")
	List<WebElement> listAnnoVencimiento;
	
	@FindBy(id="CODIGO_SEGURIDAD")
	WebElement txtCodigo;
	
	@FindBy(id="CUOTAS")
	List<WebElement> listCuotas;
	
	@FindBy(id="NOMBRE_TARJETA")
	WebElement txtNomImpTargeta;
	
	@FindBy(id="btnCancelar")
	WebElement btnCancelar;
	
	@FindBy(id="mySubmit_")
	WebElement btnConfirmar;
	
	@FindBy(xpath="//*[@id=\"ASOCIAR_CLPAY_\"]/div/input")
	WebElement btnGuardarTargetaCodensa;
	
	public void listaMes(List<String> dato) {
		for (int i = 0; i< listMesVencimiento.size(); i++) {
			if (listMesVencimiento.get(i).getText().contains(dato.get(3))) {
				listMesVencimiento.get(i).click();
				break;
			}
		}
	}
	public void listaAnno(List<String> dato) {
		for (int i = 0; i< listAnnoVencimiento.size(); i++) {
			if (listAnnoVencimiento.get(i).getText().contains(dato.get(3))) {
				listAnnoVencimiento.get(i).click();	
				break;
			}
		}
	}
	
	public void listaCuotas(List<String> dato) {
		for (int i = 0; i< listCuotas.size(); i++) {
			if (listCuotas.get(i).getText().contains(dato.get(3))) {
				listCuotas.get(i).click();	
				break;
			}
		}
	}
	
	public void seleccionarBoton(List<String> dato) {
		if (dato.contains("cancelar")) {
			btnCancelar.click();
			}else if(dato.contains("confirmar") ) {
				btnConfirmar.click();
			}else {
				System.out.println("no se encuentra el campo");
		    }
		
	}
	public void diligenciarDatos (List<String>datos) {
		
		txtNumTargeta.sendKeys(datos.get(2));
		listaMes(datos);
		listaAnno(datos);
		txtCodigo.sendKeys(datos.get(2));
		listaCuotas(datos);
		txtNomImpTargeta.sendKeys(datos.get(2));
		seleccionarBoton(datos);
		
	}
}
