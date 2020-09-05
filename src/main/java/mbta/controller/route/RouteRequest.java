package mbta.controller.route;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteRequest
{

    @JsonProperty private String stopId;


    public RouteRequest(String stopId)
    {
        this();
        this.stopId = stopId;
    }

    public RouteRequest() { }


    public String getStopId()
    {
        return stopId;
    }

}
