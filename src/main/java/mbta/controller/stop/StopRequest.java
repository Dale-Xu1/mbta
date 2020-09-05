package mbta.controller.stop;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopRequest
{

    @JsonProperty private double latitude;
    @JsonProperty private double longitude;

    @JsonProperty private int limit = 3;


    public StopRequest(double latitude, double longitude, int limit)
    {
        this(latitude, longitude);
        this.limit = limit;
    }

    public StopRequest(double latitude, double longitude)
    {
        this();

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public StopRequest() { }


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
