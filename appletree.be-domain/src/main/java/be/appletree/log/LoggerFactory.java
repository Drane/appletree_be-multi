package be.appletree.log;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * Created by jochen on 6/26/13.
 */
public class LoggerFactory {
    private Logger logger;// = LogManager.getLogger(LoggerFactory.class.getName());

    public LoggerFactory(){
        logger = Logger.getLogger(this.getClass().getName());
        logger.info("LoggerFactory constructed");
    }

    @Produces
    Logger getLogger(InjectionPoint caller){
        return Logger.getLogger(caller.getMember().getDeclaringClass().getName());
    }
}