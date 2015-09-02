package tenorio.rodrigo.restful;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.oracle.csm.cdiexample.CdiTest;

@ApplicationScoped
@Path("/RESTfulTemplate")
public class HelloImpl implements Hello {

    @Inject
    private CdiTest cdiTest;

    public HelloImpl() {
        System.out.println(HelloImpl.class.getName() + " instantiated.");
    }

    @GET
    @Path("sayHello")
    @Produces("text/plain")
    public String sayHello() {
        return "Hello!!! " + getCdiTest() + " " + getCdiTest().getMessage();
    }

    public CdiTest getCdiTest() {
        return cdiTest;
    }

    public void setCdiTest(CdiTest cdiTest) {
        this.cdiTest = cdiTest;
    }
}
