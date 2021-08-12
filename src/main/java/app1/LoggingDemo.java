package app1;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggingDemo {
	
		private static Logger logger = LogManager.getLogger(LoggingDemo.class);
			public static void main(String[] args) {
				logger.debug("This is a debug message");
				logger.error("This is a error");
				logger.warn("This is a warning");
				logger.info("Info message");
				logger.trace("trace message");
				}
			}

