package be.appletree.ejb.log;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by jochen on 6/26/13.
 */
@Startup
@Singleton
public class Core {

    @Inject
    private Logger logger;

    @PostConstruct
    void init(){
        logger.info("Core started");
    }
}