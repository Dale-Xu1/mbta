package mbta.controller.stop;

@SuppressWarnings({ "unused", "RedundantSuppression", "FieldCanBeLocal", "FieldMayBeFinal" })
public class StopRequest
{

    private double latitude;
    private double longitude;

    private int limit = 3;


    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public int getLimit()
    {
        return limit;
    }

}
