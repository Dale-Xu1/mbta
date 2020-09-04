package mbta.model.stop;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopBody
{

    public static class Stop
    {
        public static class Attributes
        {
            @JsonProperty private String name;

            @JsonProperty private double latitude;
            @JsonProperty private double longitude;

            public String getName()
            {
                return name;
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

        public static class Relationships
        {
            public static class ParentStation
            {
                public static class Data
                {
                    @JsonProperty private String id;

                    public String getId()
                    {
                        return id;
                    }
                }

                @JsonProperty private Data data;

                public Data getData()
                {
                    return data;
                }
            }

            @JsonProperty("parent_station") private ParentStation parentStation;

            public ParentStation getParentStation()
            {
                return parentStation;
            }
        }

        @JsonProperty private String id;

        @JsonProperty private Attributes attributes;
        @JsonProperty private Relationships relationships;

        public String getId()
        {
            return id;
        }

        public Attributes getAttributes()
        {
            return attributes;
        }

        public Relationships getRelationships()
        {
            return relationships;
        }
    }


    @JsonProperty private Stop[] data;

    public Stop[] getData()
    {
        return data;
    }

}
