package mbta.controller.prediction;

import mbta.APIResources;
import mbta.model.prediction.Prediction;
import mbta.model.prediction.PredictionBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/prediction")
public class PredictionController
{

    private final RestTemplate template = new RestTemplate();


    @GetMapping
    public Prediction[] getPredictions(@RequestBody PredictionRequest request)
    {
        String url = APIResources.MBTA_URL + "/predictions" +
            "?filter[stop]=" + request.getStopId() +
            "&filter[route]=" + request.getRouteId() +
            "&sort=time&api_key=" + APIResources.MBTA_KEY;

        // Get data and parse JSON
        PredictionBody predictionBody = template.getForObject(url, PredictionBody.class);
        assert predictionBody != null;

        // Extract meaningful data
        PredictionBody.Prediction[] data = predictionBody.getData();
        Prediction[] predictions = new Prediction[data.length];

        for (int i = 0; i < predictions.length; i++)
        {
            predictions[i] = new Prediction(data[i]);
        }

        return predictions;
    }

}
