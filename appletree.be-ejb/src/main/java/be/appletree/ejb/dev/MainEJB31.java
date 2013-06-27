package be.appletree.ejb.dev;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by jochen on 6/26/13.
 */
@Stateless
public class MainEJB31 {

    @Inject
    Hello hello;

    public String saySomething() {
        return hello.sayHelloWorld();
    }
}