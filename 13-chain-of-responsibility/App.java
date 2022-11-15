package logger;

import java.lang.System.Logger;

public class App {

  public static void main(String[] args){

    AbstractLogger logger = new ErrorLogger(AbstractLogger.ERROR); 
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG); 
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO); 


    logger.setNextLogger(fileLogger); 
    fileLogger.setNextLogger(consoleLogger); 

    logger.logMessage(AbstractLogger.INFO, "This is an information."); 

    logger.logMessage(AbstractLogger.DEBUG, "This is a debug level information."); 

    logger.logMessage(AbstractLogger.ERROR, "This is an error level information."); 

  }
}

