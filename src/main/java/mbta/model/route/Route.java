package mbta.model.route;

import com.fasterxml.jackson.annotation.JsonProperty;
import mbta.model.route.RouteBody.Route.Attributes;

public class Route
{

    public static class Direction
    {
        private final String name;
        private final String destination;

        public Direction(String name, String destination)
        {
            this.name = name;
            this.destination = destination;
        }

        @JsonProperty
        public String getName()
        {
            return name;
        }

        @JsonProperty
        public String getDestination()
        {
            return destination;
        }
    }


    private final String name;
    private final String shortName;

    private final String id;

    private final Direction[] directions;


    public Route(RouteBody.Route route)
    {
        Attributes attributes = route.getAttributes();

        String[] directionNames = attributes.getDirectionNames();
        String[] directionDestinations = attributes.getDirectionDestinations();

        // Get data
        name = attributes.getLongName();
        shortName = attributes.getShortName();

        id = route.getId();

        // Get directions
        directions = new Direction[directionNames.length];

        for (int i = 0; i < directions.length; i++)
        {
            String name = directionNames[i];
            String destination = directionDestinations[i];

            directions[i] = new Direction(name, destination);
        }
    }


    @JsonProperty
    public String getName()
    {
        return name;
    }

    @JsonProperty
    public String getShortName()
    {
        return shortName;
    }

    @JsonProperty
    public String getId()
    {
        return id;
    }

    @JsonProperty
    public Direction[] getDirections()
    {
        return directions;
    }

}
