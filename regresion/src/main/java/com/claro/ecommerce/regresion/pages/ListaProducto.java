package com.claro.ecommerce.regresion.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ListaProducto  extends PageObject {

	
		
		@FindBy(xpath = "//*[@class=\"selectWrapper selectWrapperPageSize\"]/span/span")
		WebElement btnLista;
		
		@FindBy(xpath = "//*[@class=\"ui-selectmenu-menu ui-front ui-selectmenu-open\"]/ul/li[4]/div")
		WebElement selectTodo;
		
		@FindBy(xpath = "//div[@class='product_name']")
		List<WebElement> listEquipos;
		
		@FindBy(xpath = "//div[@class='product_image']/div[1]")
	    List<WebElementFacade> testA;
		
		@FindBy(xpath = "//*[@id=\"productPageAdd2Cart\"]/span/a")// boton añadir carrito antes del popup
		WebElement btnCarrito;
		
// metodo lista productos seleccionar todo
		
	public void botonLista () {
		btnLista.click();
		selectTodo.click();
	}
	
//metodo buscar y seleccionar producto
	public void chooseRandomProduct(List<String> producto) throws InterruptedException {
		for (int i = 0; i< listEquipos.size(); i++) {
			if (listEquipos.get(i).getText().contains(producto.get(2))) {
				Serenity.takeScreenshot();
				listEquipos.get(i).click();
				testA.get(i).click();
				break;
			}
		}
	}
	
//metodo añadir al carrito
	public void clickAgregarCarrito() {
		element (btnCarrito).click();
	}
}
