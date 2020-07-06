package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utilities {
public static Logger getLog(Class clazz) {
	
	Logger log =Logger.getLogger(clazz);
	PropertyConfigurator.configure("C:\\Users\\jamir\\Desktop\\OSA1221201905A\\TestNG_02\\src\\test\\resources\\log4j.properties");
    return log;	
	
	
}
}
