package com.Ecommerce.tiendaClaro.regresion.Runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import com.Ecommerce.tiendaClaro.regresion.Runner.*;
import com.Ecommerce.tiendaClaro.regresion.stepDefinition.*;

import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;

public class TestMain {
	static JUnitCore JUnitCoreEjecuta;

	public static void main(String[] args) throws Throwable {
// se le evia los argumentos  
		 if (args.length == 0 || args.length > 3) {
		 System.out.println("Cantidad de parametros no corresponde con el esperado");
		 }
// imita la estructura del rummer, inicializa el caso de prueba a ejecutar
			if (args[0].contains("@")) {
				System.out.println("feature "+args[0]);
				net.serenitybdd.cucumber.cli.Main.main(new String [] {
						"feature",
						"--glue","com.Ecommerce.tiendaClaro.stepDefinition",
						"--tags", args[0]
								
				});

			} else {
				System.out.println("Oye te hace falta la <@> revísalo ");
			}
		}


	}

