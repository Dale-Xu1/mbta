package mbta.model.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PredictionBody
{

    public static class Prediction
    {
        public static class Attributes
        {
            @JsonProperty("arrival_time") private String arrivalTime;
            @JsonProperty("departure_time") private String departureTime;

            @JsonProperty("direction_id") private int directionId;


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

        @JsonProperty private Attributes attributes;

        public Attributes getAttributes()
        {
            return attributes;
        }
    }


    @JsonProperty private Prediction[] data;

    public Prediction[] getData()
    {
        return data;
    }

}
