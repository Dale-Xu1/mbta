package mbta.prediction;

import mbta.prediction.PredictionList.Prediction.Attributes;

@SuppressWarnings({ "unused", "RedundantSuppression" })
public class Prediction
{

    private final String arrivalTime;
    private final String departureTime;

    private final int direction;


    public Prediction(PredictionList.Prediction prediction)
    {
        Attributes attributes = prediction.getAttributes();

        arrivalTime = attributes.getArrivalTime();
        departureTime = attributes.getDepartureTime();

        direction = attributes.getDirectionId();
    }


    public String getArrivalTime()
    {
        return arrivalTime;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }

    public int getDirection()
    {
        return direction;
    }

}
