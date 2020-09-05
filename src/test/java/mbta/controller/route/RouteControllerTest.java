package mbta.controller.route;

import mbta.model.route.Route;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RouteControllerTest
{

    @Autowired
    private RouteController controller;


    @Test
    public void contextLoads()
    {
        assertNotNull(controller);
    }

    @Test
    public void getsRoutes()
    {
        // Request routes connected to Park Street
        RouteRequest request = new RouteRequest("place-pktrm");
        Route[] routes = controller.getRoutes(request);

        assertNotNull(routes);
    }

}