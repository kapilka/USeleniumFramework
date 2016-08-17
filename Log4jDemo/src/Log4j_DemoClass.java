import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4j_DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger=Logger.getLogger("Log4j_DemoClass");
		PropertyConfigurator.configure("C:\\USeleniumFramework\\Log4jDemo\\log4j.properties");
		logger.debug("This is DEbug");
		logger.fatal("fatal");
		logger.info("info");
		logger.warn("warn");
		logger.error("Error");
		
		System.out.println("I am here");
		
		
		

	}

}
