package be.appletree.web;

import be.appletree.ejb.HelloEjb;
import be.appletree.model.Common;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jochen on 6/26/13.
 */

@WebServlet(value = "/dev/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

    private static Logger logger;// = Logger.getLogger(HelloServlet.class.getName());

    public HelloServlet(){
        logger = Logger.getLogger(HelloServlet.class.getName());
    }

    /*@Inject
    @Default
    private Logger log;*/

    /*@EJB(name = "HelloEjb")
    private HelloEjb ejb;*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        logger.warning("log: {}"+log);
//        log.info("doGet({}, {})",request, response);

        ServletOutputStream out = response.getOutputStream();
        out.println("<html><body>");
        out.println("<p>Servlet says hey.</p>");
        Common common = new Common();
        out.println("<p>" + common.sayHello() + "</p>");
//        out.println("<p>" + ejb.sayHello() + "</p>");
        out.println("</body></html>");
        out.flush();
    }
}
