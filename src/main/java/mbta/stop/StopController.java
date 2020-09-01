package mbta.stop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/stop")
public class StopController
{

    private final RestTemplate template = new RestTemplate();


    @GetMapping
    public Stop[] getStops(@RequestBody StopRequest request)
    {
        String url = "https://api-v3.mbta.com/stops" +
            "?filter[latitude]=" + request.getLatitude() +
            "&filter[longitude]=" + request.getLongitude() +
            "&page[limit]=" + request.getLimit() +
            "&sort=distance";

        // Get data and parse JSON
        StopList stopList = template.getForObject(url, StopList.class);
        assert stopList != null;

        // Extract meaningful data
        StopList.Stop[] data = stopList.getData();
        Stop[] stops = new Stop[data.length];

        for (int i = 0; i < stops.length; i++)
        {
            stops[i] = new Stop(data[i]);
        }

        return stops;
    }

}
