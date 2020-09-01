package mbta.stop;

import mbta.stop.StopList.Stop.Attributes;
import mbta.stop.StopList.Stop.Relationships.ParentStation.Data;

@SuppressWarnings({ "unused", "RedundantSuppression" })
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

        public double getLatitude()
        {
            return latitude;
        }

        public double getLongitude()
        {
            return longitude;
        }
    }


    private final String name;
    private final String id;

    private final Location location;


    public Stop(StopList.Stop stop)
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


    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public Location getLocation()
    {
        return location;
    }

}
