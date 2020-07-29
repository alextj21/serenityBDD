package com.claro.ecommerce.regresion.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class navegador {

	
	@SuppressWarnings("unused")
	public String getValorProperties(String variable) throws IOException {

		String result = "";
		InputStream inputStream = null;

		try {

			Properties prop = new Properties();
			String propFileName = "./serenity.properties";
			inputStream = new FileInputStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("Archivo de Propiedades '" + propFileName + "' no encontrado.");
			}

			result = prop.getProperty(variable);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}

		return result;
	}
}
