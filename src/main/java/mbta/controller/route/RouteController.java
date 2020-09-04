package mbta.controller.route;

import mbta.APIResources;
import mbta.model.route.Route;
import mbta.model.route.RouteBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/route")
public class RouteController
{

    private final RestTemplate template = new RestTemplate();


    @GetMapping
    public Route[] getRoutes(@RequestBody RouteRequest request)
    {
        String url = APIResources.MBTA_URL + "/routes" +
            "?filter[stop]=" + request.getStopId() +
            "&api_key=" + APIResources.MBTA_KEY;

        // Get data and parse JSON
        RouteBody routeBody = template.getForObject(url, RouteBody.class);
        assert routeBody != null;

        // Extract meaningful data
        RouteBody.Route[] data = routeBody.getData();
        Route[] routes = new Route[data.length];

        for (int i = 0; i < routes.length; i++)
        {
            routes[i] = new Route(data[i]);
        }

        return routes;
    }

}
