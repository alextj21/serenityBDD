package com.Ecommerce.tiendaClaro.regresion.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="feature/productoLogin.feature",
//tags= " @compraExitosaLogin",

@CucumberOptions(features="feature/compraAnonimoLogin.feature",
tags= " @compraExitosaproductoAnonimoLogin",

//@CucumberOptions(features="feature/compraAnonimoUsuarioNuevo.feature",
//tags="@compraExitosaproductoAnonimoUsuarioNuevo",

//@CucumberOptions(features="feature/simuladorAnonimoLogin.feature",
//tags="@simulacionAnonimo",
//tags="@compraFallidaLogin",

//@CucumberOptions(features="feature/productoUsuarioNuevo.feature",
//tags="@compraExitosaUsuarioNuevo",
//tags="@compraFallidaUsuarioNuevo",

//@CucumberOptions(features="feature/compraAnonimoUsuarioNuevo.feature",
//tags="@compraExitosaproductoAnonimoUsuarioNuevo",

//@CucumberOptions(features="feature/usuarioNuevo.feature",
//tags="@usuarioExitoso",
//tags="@usuarioFallido",
//@CucumberOptions(features="feature/login.feature",
//tags="@loginExitoso",
//tags="@loginFallido",
glue="com.Ecommerce.tiendaClaro.regresion.stepDefinition")
public class RunnerTest {

}
