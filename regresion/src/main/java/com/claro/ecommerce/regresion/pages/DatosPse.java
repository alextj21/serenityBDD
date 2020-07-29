package com.claro.ecommerce.regresion.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DatosPse extends PageObject {

	@FindBy(xpath="//*[@id=\"BANCO\"]")
	List<WebElement> listBancos;
	
	@FindBy(xpath="//*[@id=\"TITULAR\"]")
	WebElement txtTitular;
	
	@FindBy(xpath="//*[@id=\"TIPO_CLIENTE\"]/option")
	List<WebElement> listTipoCliente;
	
	@FindBy(id="btnCancelar")
	WebElement btnCancelar;
	
	@FindBy(id="mySubmit_")
	WebElement btnConfirmar;
	
	public void listaBancos(List<String> dato)  {
		System.out.println("banco: "+dato.get(1));
		System.out.println("lista"+listBancos.size());
		
	   for (int i = 0; i< listBancos.size(); i++) {
			
			if (listBancos.get(i).getText().contains(dato.get(1))) {
				listBancos.get(i).click();
				
				break;
			}
		}
	}
	
	public void tipoCliente(List<String> dato) {
		for (int i = 0; i< listTipoCliente.size(); i++) {
			if (listTipoCliente.get(i).getText().contains(dato.get(2))) {
				listTipoCliente.get(i).click();
				
				break;
			}
		}
	}
	
	public void seleccionarBoton(List<String> dato) {
		if (dato.get(0).contains("cancelar")) {
			btnCancelar.click();
			}else if(dato.contains("confirmar") ) {
				btnConfirmar.click();
			}else {
				System.out.println("no se encuentra el campo");
		    }
		
	}
	public void diligenciarDatos(List<String>datos) throws InterruptedException  {
		Thread.sleep(6000);
		//listaBancos(datos);
		try {
			WebElement prueba = this.element(By.cssSelector("#TITULAR"));
			if(prueba != null) {
				try {System.out.println("INFO A ENVIAR " + datos.get(1));}
				catch(Exception xx){
					
				}
				prueba.sendKeys(datos.get(1));
				System.out.println("NO FALLÓ");
			}
			else
				System.out.println("VALOR NULO");
			
		}catch(Exception e) {
			System.out.println("FALLÓ POR EXCEPTION");
		}
		
		//listaBancos(datos);
		
		getDriver().findElement (By.xpath("//*[@id=\"TITULAR\"]")).sendKeys("alberto");;
		//txtTitular.sendKeys("alberto");
		Thread.sleep(5000);
		tipoCliente(datos);
		seleccionarBoton(datos);
	}
}
