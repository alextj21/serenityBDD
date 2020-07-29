package com.claro.ecommerce.regresion.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MenuSesion extends PageObject {

	@FindBy(id="Header_GlobalLogin_signInQuickLink")
	WebElement btnLogin;
	
	@FindBy(id="createAccount")
	WebElement BtnCrearCuenta;
	
	@FindBy(xpath="//*[@id=\"createAccountLinkShopCart\"]") 
	WebElement BtnCrearCuentaYComprar;
	
	
// metodo seleccionar iniciar sesion	
public void clickLogin () {
		element(btnLogin).click();
	}
//metodo seleccionar crear cuenta
public void ClickCrearCuenta() {
		element(BtnCrearCuenta).click();
	}
public void clickCuentaComprar() throws InterruptedException{
		element(BtnCrearCuentaYComprar).click();
	}
		
}
