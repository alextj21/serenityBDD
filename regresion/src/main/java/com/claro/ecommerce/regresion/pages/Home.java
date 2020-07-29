package com.claro.ecommerce.regresion.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;



//@DefaultUrl("https://tiendaqa.claro.com.co")

public class Home extends PageObject {
	navegador navegar = new navegador();
	
	@FindBy(xpath = "//*[@id=\"details-button\"]")
	WebElement btnAccesoChrome;
		
	@FindBy(xpath = "//*[@id=\"proceed-link\"]")
	WebElement btnSaltarValidacionChrome;
	
	@FindBy(xpath = "//*[@id=\"moreInformationDropdownSpan\"]")
	WebElement btnAccesoEdge;
	
	@FindBy(xpath = "//*[@id=\"invalidcert_continue\"]")
	WebElement btnSaltarValidacionEdge;
	
	@FindBy(xpath = "//*[@id=\"moreInfoContainer\"]")
	WebElement btnAccesoExplorer;
	
	@FindBy(xpath = "//*[@id=\"overridelink\"]")
	WebElement btnSaltarValidacionExplorer;
	
	
// metodo acceso url 	
	public void refreshPage() throws IOException {
		System.out.println(navegar.getValorProperties("webdriver.driver"));
		if (navegar.getValorProperties("webdriver.driver").contains("Chrome")) {
		//btnAccesoChrome.click();
		//btnSaltarValidacionChrome.click();
		}else if(navegar.getValorProperties("webdriver.driver").contains("edge")){
			btnAccesoEdge.click();
			btnSaltarValidacionEdge.click();
			
		}else if(navegar.getValorProperties("webdriver.driver").contains("iexplorer")) {
			btnAccesoExplorer.click();
			btnSaltarValidacionExplorer.click();
		}else {
			System.out.println("ingresar");
		}
		
	}
	
}
