package mbta.model.route;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteBody
{

    public static class Route
    {
        public static class Attributes
        {
            @JsonProperty("short_name") private String shortName;
            @JsonProperty("long_name") private String longName;

            @JsonProperty("direction_names") private String[] directionNames;
            @JsonProperty("direction_destinations") private String[] directionDestinations;

            public String getShortName()
            {
                return shortName;
            }

            public String getLongName()
            {
                return longName;
            }

            public String[] getDirectionNames()
            {
                return directionNames;
            }

            public String[] getDirectionDestinations()
            {
                return directionDestinations;
            }

        }

        @JsonProperty private String id;
        @JsonProperty private Attributes attributes;

        public String getId()
        {
            return id;
        }

        public Attributes getAttributes()
        {
            return attributes;
        }
    }


    @JsonProperty private Route[] data;

    public Route[] getData()
    {
        return data;
    }

}
