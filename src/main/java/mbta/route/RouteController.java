package mbta.route;

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
        String url = "https://api-v3.mbta.com/routes" +
            "?filter[stop]=" + request.getStopId();

        // Get data and parse JSON
        RouteList routeList = template.getForObject(url, RouteList.class);
        assert routeList != null;

        // Extract meaningful data
        RouteList.Route[] data = routeList.getData();
        Route[] routes = new Route[data.length];

        for (int i = 0; i < routes.length; i++)
        {
            routes[i] = new Route(data[i]);
        }

        return routes;
    }

}
