package be.appletree.web.ejb.dev;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.logging.Logger;
import org.slf4j.Logger;

/**
 * Created by jochen on 6/27/13.
 */

@WebServlet(urlPatterns = "/dev/mainServlet30")
public class MainServlet30 extends HttpServlet {

    @Inject
    Hello hello;

    @Inject
    private java.util.logging.Logger javaUtilLogger;

    @Inject
    private Logger logger;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println(saySomething());
        out.close();
    }

    public String saySomething() {
        javaUtilLogger.info("java.util.logging.Logger > Hello not null: "+hello);
        logger.info("org.slf4j.Logger > not null: " + hello);
        return hello.sayHelloWorld();
    }
}