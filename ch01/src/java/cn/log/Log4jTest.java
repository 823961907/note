package cn.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jTest{
    
    private static Logger logger = Logger.getLogger(Log4jTest.class);
    public static void main(String args[]){
	PropertyConfigurator.configure("config/log4j.properties");
	logger.debug("This is debug message.");
	logger.info("This is info message.");
	logger.error("This is error message.");
    }
}
