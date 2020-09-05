package mbta.controller.stop;

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

}