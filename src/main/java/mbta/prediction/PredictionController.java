package mbta.prediction;

import mbta.APIResources;
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
        PredictionList predictionList = template.getForObject(url, PredictionList.class);
        assert predictionList != null;

        // Extract meaningful data
        PredictionList.Prediction[] data = predictionList.getData();
        Prediction[] predictions = new Prediction[data.length];

        for (int i = 0; i < predictions.length; i++)
        {
            predictions[i] = new Prediction(data[i]);
        }

        return predictions;
    }

}
