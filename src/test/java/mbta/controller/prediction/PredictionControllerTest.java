package mbta.controller.prediction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PredictionControllerTest
{

    @Autowired
    private PredictionController controller;


    @Test
    public void contextLoads()
    {
        assertNotNull(controller);
    }

}