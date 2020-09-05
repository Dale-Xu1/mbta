package mbta.controller.stop;

import mbta.model.stop.Stop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StopControllerTest
{

    @Autowired
    private StopController controller;


    @Test
    public void contextLoads()
    {
        assertNotNull(controller);
    }

    @Test
    public void getsStation()
    {
        // Request stops near Park Street
        int limit = 1;
        StopRequest request = new StopRequest(42.3563819, -71.0622741, limit);

        Stop[] stops = controller.getStops(request);

        assertNotNull(stops);
        assertEquals(stops.length, limit);
    }

    @Test
    public void getsBusStop()
    {
        // Request stops near Grove Street
        StopRequest request = new StopRequest(42.3043609, -71.1501227);
        Stop[] stops = controller.getStops(request);

        assertNotNull(stops);
    }

}