package mbta.model.route;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings({ "unused", "RedundantSuppression" })
public class RouteList
{

    public static class Route
    {
        public static class Attributes
        {
            @JsonProperty("short_name")
            private String shortName;

            @JsonProperty("long_name")
            private String longName;

            @JsonProperty("direction_names")
            private String[] directionNames;

            @JsonProperty("direction_destinations")
            private String[] directionDestinations;

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

        private String id;
        private Attributes attributes;

        public String getId()
        {
            return id;
        }

        public Attributes getAttributes()
        {
            return attributes;
        }
    }


    private Route[] data;

    public Route[] getData()
    {
        return data;
    }

}
