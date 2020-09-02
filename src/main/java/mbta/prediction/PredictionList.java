package mbta.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings({ "unused", "RedundantSuppression" })
public class PredictionList
{

    public static class Prediction
    {
        public static class Attributes
        {
            @JsonProperty("arrival_time")
            private String arrivalTime;

            @JsonProperty("departure_time")
            private String departureTime;

            @JsonProperty("direction_id")
            private int directionId;

            public String getArrivalTime()
            {
                return arrivalTime;
            }

            public String getDepartureTime()
            {
                return departureTime;
            }

            public int getDirectionId()
            {
                return directionId;
            }
        }

        private Attributes attributes;

        public Attributes getAttributes()
        {
            return attributes;
        }
    }


    private Prediction[] data;

    public Prediction[] getData()
    {
        return data;
    }

}
