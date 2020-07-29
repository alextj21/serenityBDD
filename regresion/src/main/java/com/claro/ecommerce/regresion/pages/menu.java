package com.claro.ecommerce.regresion.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class menu extends PageObject {
	
	@FindBy(xpath = "//*[@id='subMenuTienda']/div[1]/dl[1]/dt")
	WebElement btnMenuCelulares;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[1]/dd/a")
	List<WebElement> listSubMenuCelulares;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[2]/dt")
	WebElement btnMenuTecnologia;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[2]/dd/a")
	List<WebElement> listSubMenuTecnologia;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[3]/dt")
	WebElement btnMenuMoviles;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[3]/dd/a")
	List<WebElement> listSubMenuMoviles;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[4]/dt")
	WebElement btnMenuFijos;
	
	@FindBy(xpath = "//*[@id=\"subMenuTienda\"]/div[1]/dl[4]/dd/a")
	List<WebElement> listSubMenuFijos;

// metodo seleccionar opcion del menu y submenu
	public void opcionMenu (List<String> opMenu) throws InterruptedException {
		switch (opMenu.get(0)){
		  case "celulares":
		 	    btnMenuCelulares.click();
			    Serenity.takeScreenshot();
			    menuCelulares(opMenu.get(1).toString());
			    break;
		  case "tecnologia":
			    btnMenuTecnologia.click();
			    Serenity.takeScreenshot();
			    menuTecnologia(opMenu.get(1).toString());
			    break;
		  case "moviles":
			    btnMenuMoviles.click();
			    Serenity.takeScreenshot();
			    menuServiciosMoviles(opMenu.get(1).toString());
			    break;
		  case "fijos":
		        btnMenuFijos.click();
		        menuServiciosFijos(opMenu.get(1).toString());
		        break;
		  default :
			    System.out.println("Switch Case : Default");
		}
		}
	
// metodo lista submenu	celulares
public void menuCelulares(String dato) throws InterruptedException {
		for (int i = 0; i< listSubMenuCelulares.size(); i++) {
		    if (listSubMenuCelulares.get(i).getText().contains(dato))  {
			       Serenity.takeScreenshot();
			       listSubMenuCelulares.get(i).click();
			 break;
	    }
	}
}
// metodo lista submenu tecnologia
public void menuTecnologia(String dato) throws InterruptedException {
		for (int i = 0; i< listSubMenuTecnologia.size(); i++) {
		    if (listSubMenuTecnologia.get(i).getText().contains(dato))  {
			       Serenity.takeScreenshot();
			       listSubMenuTecnologia.get(i).click();
			       break;
	    }
	}
}
	
// metodo lista submenu servicios moviles
public void menuServiciosMoviles(String dato) throws InterruptedException {
	    for (int i = 0; i< listSubMenuMoviles.size(); i++) {
	        if (listSubMenuMoviles.get(i).getText().contains(dato))  {
		           Serenity.takeScreenshot();
		           listSubMenuMoviles.get(i).click();
		           break;
        }
    }
}
// metodo lista submenu servicios fijos
public void menuServiciosFijos(String dato) throws InterruptedException {
	    for (int i = 0; i< listSubMenuFijos.size(); i++) {
	       if (listSubMenuFijos.get(i).getText().contains(dato))  {
		           Serenity.takeScreenshot();
		           listSubMenuFijos.get(i).click();
		           break;
        }
    }
 }
}
