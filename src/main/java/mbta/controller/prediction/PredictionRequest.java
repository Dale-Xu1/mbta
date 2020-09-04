package mbta.controller.prediction;

@SuppressWarnings({ "unused", "RedundantSuppression", "FieldCanBeLocal", "FieldMayBeFinal" })
public class PredictionRequest
{

    private String stopId;
    private String routeId;


    public String getStopId()
    {
        return stopId;
    }

    public String getRouteId()
    {
        return routeId;
    }

}
