package com.OrangeHRM.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties Prop;

	public ReadConfig(){

		File src = new File("./Config/Config.properties");

		try {
			FileInputStream Fis = new FileInputStream(src);
			Prop = new Properties();
			Prop.load(Fis);
		} catch (Exception e) {
			System.out.println("Exception Is " + e.getMessage());
		}
	}

	public String GetAppUrl() {

		String AppUrl = Prop.getProperty("BaseUrl");
		return AppUrl;
	}

	public String GetUserName() {

		String UserName = Prop.getProperty("SetUserName");
		return UserName;
	}

	public String GetPassword() {

		String Password = Prop.getProperty("SetPassword");
		return Password;
	}

	public String GetChromePath() {

		String ChromePath = Prop.getProperty("ChromePath");
		return ChromePath;
	}

	public String GetFireFoxPath() {

		String FireFoxPath = Prop.getProperty("FireFoxPath");
		return FireFoxPath;
	}

}
