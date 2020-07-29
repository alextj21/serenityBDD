package com.claro.ecommerce.regresion.pages;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class TerminosYCondiciones extends PageObject {
	
	@FindBy(id="termCondSwitch")
	WebElement btnCondiciones;

	@FindBy(xpath="//*[@id=\"termCondLabel\"]/a")
	WebElement linkPoliticas;
	
	@FindBy(xpath="//*[@id=\"plugin\"]")
	String docPoliticas;
	
	
	@FindBy(xpath="//*[@id=\"termCondLabel\"]/a[2]")
	WebElement linkTratamiento;
	
	@FindBy(xpath="//*[@id=\"termCondSwitch\"]/span")
	WebElement btnTerminos;
	
	@FindBy(xpath="//*[@class=\"closejAlert ja_close ja_close_round\"]")
	WebElement btnTratamiento;
	
	@FindBy(xpath="//*[@id=\"WC_BreadCrumbTrailDisplay_links_2a\"]/div[2]")
	WebElement btnRegresar;
	
	
	
// metodo link terminos y condiciones
	public void linkTerminosyCondiciones () {
		
		element(linkPoliticas).click();
		Set<String> handlesSet = getDriver().getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
	    getDriver().switchTo().window(handlesList.get(1));
	    Serenity.takeScreenshot();
	    getDriver().close();
        getDriver().switchTo().window(handlesList.get(0));
	}
// metodo link tratamiento 
	public void popupTratamientoDatos() throws InterruptedException {
		element(linkTratamiento).click();
		Serenity.takeScreenshot();
		Thread.sleep(5000);
		element(btnTratamiento).click();
	}
// metodos aceptar terminos y condiciones
	public void AceptarCondiciones() {
		element(btnCondiciones).click();
		Serenity.takeScreenshot();
	}
	public void Condiciones() throws InterruptedException {
		
		Thread.sleep(3000);
		((org.openqa.selenium.JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView();",btnRegresar);
		Serenity.takeScreenshot();
		element(btnCondiciones).click();
		Serenity.takeScreenshot();
	
	}
	
}
