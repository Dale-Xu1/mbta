package mbta.model.stop;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings({ "unused", "RedundantSuppression" })
public class StopList
{

    public static class Stop
    {
        public static class Attributes
        {
            private String name;

            private double latitude;
            private double longitude;

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
                    private String id;

                    public String getId()
                    {
                        return id;
                    }
                }

                private Data data;

                public Data getData()
                {
                    return data;
                }
            }

            @JsonProperty("parent_station")
            private ParentStation parentStation;

            public ParentStation getParentStation()
            {
                return parentStation;
            }
        }

        private String id;

        private Attributes attributes;
        private Relationships relationships;

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


    private Stop[] data;

    public Stop[] getData()
    {
        return data;
    }

}
