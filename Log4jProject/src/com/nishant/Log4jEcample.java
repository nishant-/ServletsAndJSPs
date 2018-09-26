package com.nishant;

import org.apache.log4j.*;

public class Log4jEcample {

	static final Logger log = Logger.getLogger(Log4jEcample.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("inside method main");
	}
}
