package mbta.controller.route;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteRequest
{

    @JsonProperty private String stopId;


    public String getStopId()
    {
        return stopId;
    }

}
