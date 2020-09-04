package mbta.model.stop;

import com.fasterxml.jackson.annotation.JsonProperty;
import mbta.model.stop.StopBody.Stop.Attributes;
import mbta.model.stop.StopBody.Stop.Relationships.ParentStation.Data;

public class Stop
{

    public static class Location
    {
        private final double latitude;
        private final double longitude;

        public Location(double latitude, double longitude)
        {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        @JsonProperty
        public double getLatitude()
        {
            return latitude;
        }

        @JsonProperty
        public double getLongitude()
        {
            return longitude;
        }
    }


    private final String name;
    private final String id;

    private final Location location;


    public Stop(StopBody.Stop stop)
    {
        Attributes attributes = stop.getAttributes();
        Data data = stop.getRelationships().getParentStation().getData();

        // Get data
        name = attributes.getName();
        id = (data == null) ? stop.getId() : data.getId();

        // Get location
        double latitude = attributes.getLatitude();
        double longitude = attributes.getLongitude();
        location = new Location(latitude, longitude);
    }


    @JsonProperty
    public String getName()
    {
        return name;
    }

    @JsonProperty
    public String getId()
    {
        return id;
    }

    @JsonProperty
    public Location getLocation()
    {
        return location;
    }

}
