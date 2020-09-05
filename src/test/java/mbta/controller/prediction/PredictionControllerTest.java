package mbta.controller.prediction;

import mbta.model.prediction.Prediction;
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

    @Test
    public void getsPredictions()
    {
        // Request D-line predictions at Park Street
        PredictionRequest request = new PredictionRequest("place-pktrm", "Green-D");
        Prediction[] predictions = controller.getPredictions(request);

        assertNotNull(predictions);
    }

}