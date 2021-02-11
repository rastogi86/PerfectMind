package com.perfectmind.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	static Properties prop;

	public ConfigDataProvider() {

		try {
			FileInputStream fis = new FileInputStream(new File("./Configuration/config.properties"));
			prop = new Properties();
			prop.load(fis);

//or new Properties().load(new FileInputStream(new File("./Configuration/config.properties")));

		}

		catch (Exception e) {
			System.out.println("Unable to load property file " + e.getMessage());
		}
	}

	public String getProperties(String key) {
		return prop.getProperty(key);
	}

}
