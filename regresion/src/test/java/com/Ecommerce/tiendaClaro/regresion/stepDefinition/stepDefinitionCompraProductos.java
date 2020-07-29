package com.Ecommerce.tiendaClaro.regresion.stepDefinition;

import java.io.IOException;
import java.util.List;

import com.claro.ecommerce.regresion.pages.DatosEnvio;
import com.claro.ecommerce.regresion.pages.Home;
import com.claro.ecommerce.regresion.pages.ListaProducto;
import com.claro.ecommerce.regresion.pages.Login;
import com.claro.ecommerce.regresion.pages.MenuSesion;
import com.claro.ecommerce.regresion.pages.MetodoPago;
import com.claro.ecommerce.regresion.pages.Popup;
import com.claro.ecommerce.regresion.pages.TerminosYCondiciones;
import com.claro.ecommerce.regresion.pages.menu;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;

public class stepDefinitionCompraProductos {
	
	 

	    
	    TerminosYCondiciones terminos= new TerminosYCondiciones();
	    menu opcion= new menu();
	    DatosEnvio envio= new DatosEnvio();
	    ListaProducto producto = new  ListaProducto();
	    MetodoPago pago = new MetodoPago();
	    Popup op= new Popup();
	    Home navegar= new Home();
	    MenuSesion sesion= new MenuSesion();
	    Login login= new Login();
	   
	    
	    @Given("^ingreso a la url de la tienda claro$")
	    public void ingreso_a_la_url_de_la_tienda_claro() throws IOException  {
	    	navegar.open();
		    //navegar.getDriver().navigate().refresh();
			//navegar.refreshPage();  
	    }
		@Given("^realizo la compra del producto$")
		public void realizo_la_compra_del_producto(List<String> equipo) throws Exception {
			Thread.sleep(3000);
			opcion.opcionMenu(equipo);
			Thread.sleep(3000);
			producto.botonLista();
	        producto.chooseRandomProduct(equipo);   
		}

		@Given("^agrego al carrito de compras$")
		public void agrego_al_carrito_de_compra(List<String>dato) throws Exception {
			Thread.sleep(6000);
			 producto.clickAgregarCarrito();
			 Thread.sleep(6000);
			 op.tipoDeServicio(dato); 
		}
		
		@When("^selecciono el tipo de pago$")
		public void selecciono_el_tipo_de_pago(List<String> pagos) throws Exception {
			Thread.sleep(6000);
			Serenity.takeScreenshot();
			op.validarRenovacion();
			terminos.linkTerminosyCondiciones();
			terminos.popupTratamientoDatos();
			terminos.Condiciones();
		    pago.tipoDePago(pagos);
		    Thread.sleep(3000);
		}
		
		@When("^selecciono forma de pago$")
		public void selecciono_forma_de_pago(List<String> pagos) throws Exception {
			Serenity.takeScreenshot();
			terminos.linkTerminosyCondiciones();
			terminos.popupTratamientoDatos();
			terminos.Condiciones();
			envio.continuarCompra();
			envio.downPagina();
		    pago.tipoDePago(pagos);
		}

		@When("^diligencion los datos del pago$")
		public void diligencion_los_datos_del_pago() throws Exception {
		    //pago.aprobar();
			
		}

		@Then("^valido los datos de envio$")
		public void valido_los_datos_de_envio() throws Exception {
		}
}

		
		


