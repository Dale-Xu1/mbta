package mbta.controller.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PredictionRequest
{

    @JsonProperty private String stopId;
    @JsonProperty private String routeId;


    public String getStopId()
    {
        return stopId;
    }

    public String getRouteId()
    {
        return routeId;
    }

}
