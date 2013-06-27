package be.appletree.dev.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by jochen on 6/27/13.
 */
public class DomainHelloTest {

    @Test
    public void shouldDisplayHelloWorld() {
        WeldContainer weld = new Weld().initialize();
        DomainHello hello = weld.instance().select(DomainHello.class).get();
        assertEquals("should say Hello World !!!", "Hello World !!!", hello.sayHelloWorld());
    }
}
