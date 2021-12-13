package com.news18.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;


public class FileUtility {
	public static String getPropertKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
