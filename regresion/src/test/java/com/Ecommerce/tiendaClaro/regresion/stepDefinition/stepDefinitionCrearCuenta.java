package com.Ecommerce.tiendaClaro.regresion.stepDefinition;

import java.util.List;

import com.claro.ecommerce.regresion.pages.DatosEnvio;
import com.claro.ecommerce.regresion.pages.DatosPersonales;
import com.claro.ecommerce.regresion.pages.Home;
import com.claro.ecommerce.regresion.pages.MenuSesion;
import com.claro.ecommerce.regresion.pages.TerminosYCondiciones;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitionCrearCuenta {
	
   DatosEnvio envio = new DatosEnvio();
   DatosPersonales registro = new DatosPersonales();
   TerminosYCondiciones  terminos = new TerminosYCondiciones();
   Home navegar= new Home();
   MenuSesion sesion= new MenuSesion();
   
   @Given("^ingreso a la url de la tienda claro y selecciono crear cuenta$")
	public void ingreso_a_la_url_de_la_tienda_claro_y_selecciono_crear_cuenta() throws Exception {
	     navegar.open();
		// navegar.getDriver().navigate().refresh();
		// navegar.refreshPage();
		 sesion.ClickCrearCuenta();
   }
	@Given("^ingreso los datos solicitados en los formularios$")
	public void ingreso_los_datos_solicitados_en_los_formularios(List<String>formulario) throws Exception {
		//Thread.sleep(9000);
	    registro.LlenarDatosPersonales(formulario);
	    terminos.linkTerminosyCondiciones();
		terminos.popupTratamientoDatos();
		terminos.AceptarCondiciones();
	    envio.llenarDatosDeEnvio(formulario);
	    
	}
	
	@Given("^ingreso los datos solicitados en el registro$")
	public void ingreso_los_datos_solicitados_en_el_registro(List<String>formulario) throws Exception {
		sesion.clickCuentaComprar();
	    registro.LlenarDatosPersonales(formulario);
	    envio.llenarDatosDeEnvio(formulario);    
	}
	
//	@When("^acepto los terminos y condiciones$")
//	public void acepto_los_terminos_y_condiciones() throws Exception {
//		terminos.linkTerminosyCondiciones();
//		terminos.popupTratamientoDatos();
//		terminos.AceptarCondiciones();
//	}

	@When("^hago click en el boton guardar$")
	public void hago_click_en_el_boton_guardar() throws Exception {
		registro.registrar();	
	}

	@Then("^yo valido que mi nombre aparezca en la sesion iniciada$")
	public void yo_valido_que_mi_nombre_aparezca_en_la_sesion_iniciada(List<String>dato) throws Exception {
		envio.validarUsuario(dato);
	}

	@Then("^yo valido los errores en en formulario$")
	public void yo_valido_los_errores_en_el_formulario(List<String>dato) throws Exception {
		envio.error(dato);
	}
}
