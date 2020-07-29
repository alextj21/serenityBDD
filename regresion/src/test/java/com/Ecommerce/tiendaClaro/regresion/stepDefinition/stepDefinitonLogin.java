package com.Ecommerce.tiendaClaro.regresion.stepDefinition;

import java.util.List;

import com.claro.ecommerce.regresion.pages.DatosPersonales;
import com.claro.ecommerce.regresion.pages.Home;
import com.claro.ecommerce.regresion.pages.Login;
import com.claro.ecommerce.regresion.pages.MenuSesion;
import com.claro.ecommerce.regresion.pages.Popup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinitonLogin {
	

   
	 Login login= new Login();
	 DatosPersonales registro = new DatosPersonales(); 
	 Home navegar= new Home();
	 MenuSesion sesion= new MenuSesion();
	 Popup op= new Popup();
	
	 @Given("^ingreso a la url de la tienda claro y selecciono iniciar sesion$")
		public void ingreso_a_la_url_de_la_tienda_claro_y_selecciono_iniciar_sesion() throws Exception {
		     navegar.open();
			// navegar.getDriver().navigate().refresh();
			// navegar.refreshPage();
			 sesion.clickLogin();
			
	   }
	@Given("^realizo el login con los datos requeridos$")
	public void realizo_el_login_con_los_datos_requeridos(List<String>datos) throws Exception {
		Thread.sleep(3000);
		login.iniciarSesion(datos);	 
	}
	
	@When("^doy click en iniciar sesion$")
	public void doy_click_en_iniciar_sesion() throws Exception {
		login.clickInicion();
	}

	@Then("^yo valido que aparezca mi nombre en la sesion iniciada$")
	public void yo_valido_que_aparezca_mi_nombre_en_la_sesion_iniciada(List<String>datos) throws Exception {
		login.validacionEstado(datos);
	}

	@Then("^verifico el mensaje de Excepcion$")
	public void verifico_el_mensaje_de_Excepcion(List<String>datos) throws Exception {
		login.validacionEstadoFallido(datos);
		
	}

	
}
