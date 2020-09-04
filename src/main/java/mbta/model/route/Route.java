package mbta.model.route;

import mbta.model.route.RouteList.Route.Attributes;

@SuppressWarnings({ "unused", "RedundantSuppression" })
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

        public String getName()
        {
            return name;
        }

        public String getDestination()
        {
            return destination;
        }
    }


    private final String name;
    private final String shortName;

    private final String id;

    private final Direction[] directions;


    public Route(RouteList.Route route)
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


    public String getName()
    {
        return name;
    }

    public String getShortName()
    {
        return shortName;
    }

    public String getId()
    {
        return id;
    }

    public Direction[] getDirections()
    {
        return directions;
    }

}
