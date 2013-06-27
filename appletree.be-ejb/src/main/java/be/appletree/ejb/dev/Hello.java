package be.appletree.ejb.dev;

import javax.inject.Inject;

/**
 * Created by jochen on 6/26/13.
 */

public class Hello {

    @Inject
    World world;

    public String sayHelloWorld() {
        return "Hello " + world.sayWorld();
    }
}