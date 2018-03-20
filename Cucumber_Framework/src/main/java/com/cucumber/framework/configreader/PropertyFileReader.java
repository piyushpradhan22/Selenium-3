package com.cucumber.framework.configreader;

import java.io.FileInputStream;
import java.util.Properties;

import com.cucumber.framework.configuration.browser.BrowserType;

public class PropertyFileReader implements ConfigReader{
	
	private Properties prop =null;
	
	public PropertyFileReader() {
		
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configfile\\config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getUserName() {
		return prop.getProperty("Username");
	}

	@Override
	public String getPassword() {
		return prop.getProperty("Password");
	}

	@Override
	public String getWebsite() {
		return prop.getProperty("Website");
	}

	@Override
	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	@Override
	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	@Override
	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	@Override
	public BrowserType getBrowser() {
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}

}
