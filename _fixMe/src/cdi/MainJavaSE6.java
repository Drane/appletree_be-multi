package be.appletree.dev.cdi;

import org.jboss.weld.environment.se.events.ContainerInitialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * Created by jochen on 6/27/13.
 *
 *
 * Run with "mvn exec:java"
 */
public class MainJavaSE6 {

    @Inject
    DomainHello hello;

    public void saySomething(@Observes ContainerInitialized event) {
        System.out.println(hello.sayHelloWorld());
    }
}