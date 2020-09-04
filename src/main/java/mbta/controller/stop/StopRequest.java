package mbta.controller.stop;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("FieldMayBeFinal")
public class StopRequest
{

    @JsonProperty private double latitude;
    @JsonProperty private double longitude;

    @JsonProperty private int limit = 3;


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
