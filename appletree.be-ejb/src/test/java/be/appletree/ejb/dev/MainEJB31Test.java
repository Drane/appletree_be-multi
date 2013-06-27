package be.appletree.ejb.dev;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by jochen on 6/26/13.
 */
public class MainEJB31Test {

    private static EJBContainer ec;
    private static Context ctx;

    @BeforeMethod
    public static void initContainer() throws Exception {

        String root = "";//"/home/jochen/dev/code/workspaces/IdeaProjects/appletree.be-multi/appletree.be-ejb";

        Map<String, File[]> properties = new HashMap<>();
        properties.put(EJBContainer.MODULES, new File[]{new File(root+"target/classes"), new File(root+"target/test-classes")});
        ec = EJBContainer.createEJBContainer(properties);
        ctx = ec.getContext();
    }

    @AfterClass
    public static void closeContainer() throws Exception {
        if (ec != null)
            ec.close();
    }

    @Test
    public void shouldDisplayHelloWorld() throws Exception {
        // Looks up the EJB
        MainEJB31 mainEjb = (MainEJB31) ctx.lookup("java:global/classes/MainEJB31!be.appletree.ejb.dev.MainEJB31");

        assertEquals("Hello World !!!", mainEjb.saySomething(), "should say Hello World !!!");
    }
}
