package be.appletree.dev.cdi;

import javax.inject.Inject;

/**
 * Created by jochen on 6/26/13.
 */

public class DomainHello {

    @Inject
    DomainWorld world;

    public String sayHelloWorld() {
        return "Hello " + world.sayWorld();
    }
}