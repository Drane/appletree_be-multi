package be.appletree.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

//import javax.ejb.Singleton;
//import javax.ejb.Startup;

/**
 * Created by jochen on 6/26/13.
 */
//@Startup
//@Singleton
public class Slf4jLoggerProducer {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jLoggerProducer.class);

    public static String status = "Loading";

    public Slf4jLoggerProducer() {
        logger.info("LogProducer constructed, status: {}", status);
    }

    @PostConstruct
    private void init (){
        status = "Ready";
        logger.info("LogProducer init, status: {}", status);
    }

    @Produces
    Logger createLog(final InjectionPoint injectionPoint){
        Class clazz = injectionPoint.getMember().getDeclaringClass();

        logger.info("creating logger for class {}", clazz.getName());

        return LoggerFactory.getLogger(clazz);
    }

}