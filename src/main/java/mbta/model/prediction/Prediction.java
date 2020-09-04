package mbta.model.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;
import mbta.model.prediction.PredictionBody.Prediction.Attributes;

public class Prediction
{

    private final String arrivalTime;
    private final String departureTime;

    private final int direction;


    public Prediction(PredictionBody.Prediction prediction)
    {
        Attributes attributes = prediction.getAttributes();

        arrivalTime = attributes.getArrivalTime();
        departureTime = attributes.getDepartureTime();

        direction = attributes.getDirectionId();
    }


    @JsonProperty
    public String getArrivalTime()
    {
        return arrivalTime;
    }

    @JsonProperty
    public String getDepartureTime()
    {
        return departureTime;
    }

    @JsonProperty
    public int getDirection()
    {
        return direction;
    }

}
