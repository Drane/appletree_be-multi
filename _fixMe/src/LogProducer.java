package be.appletree.ejb.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.inject.Produces;

/**
 * Created by jochen on 6/26/13.
 */
//@Startup
//@Singleton
public class LogProducer {

    private static final Logger logger = LoggerFactory.getLogger(LogProducer.class);

    public static String status = "Loading";

    public LogProducer() {
        logger.info("LogProducer constructed, status: {}", status);
    }

    @PostConstruct
    private void init (){
        status = "Ready";
        logger.info("LogProducer init, status: {}", status);
    }

    @Produces
    Log createLog(final InjectionPoint injectionPoint){
        Class clazz = injectionPoint.getMember().getDeclaringClass();

        logger.info("creating logger for class {}", clazz.getName());

        return new DefaultLog(LoggerFactory.getLogger(clazz));
    }

}