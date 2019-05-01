package rover;

import java.util.Map;
import java.util.Set;

public class RoverCommands {

    public static planetCommands planetCommands = new planetCommands();

    public static boolean roverFacesSouth(int[] roverPosition) {
        return planetCommands.mars.get(roverPosition).equals("south");
    }

    public static boolean roverFacesNorth(int[] roverPosition) {
        return planetCommands.mars.get(roverPosition).equals("north");
    }

    public static boolean roverFacesEast(int[] roverPosition) {
        return planetCommands.mars.get(roverPosition).equals("east");
    }

    public static boolean roverFacesWest(int[] roverPosition) {
        return planetCommands.mars.get(roverPosition).equals("west");
    }

    public static boolean positionIsRock(int[] roverPosition) {
        return planetCommands.mars.get(roverPosition).equals("#");
    }

    public static void moveRoverForward() {

        int[] roverPosition = findeRover();

        if (roverFacesNorth(roverPosition)) {
            roverPosition[1]--;
            if (positionIsRock(roverPosition)) {
                roverPosition[1]++;
            }
        } else if (roverFacesSouth(roverPosition)) {
            roverPosition[1]++;
            if (positionIsRock(roverPosition)) {
                roverPosition[1]--;
            }
        } else if (roverFacesEast(roverPosition)) {
            roverPosition[0]++;
            if (positionIsRock(roverPosition)) {
                roverPosition[0]--;
            }
        } else if (roverFacesWest(roverPosition)) {
            roverPosition[0]--;
            if (positionIsRock(roverPosition)) {
                roverPosition[0]++;
            }
        }
    }

    public static void moveRoverBackward() {

        int[] roverPosition = findeRover();

        if (roverFacesSouth(roverPosition)) {
            roverPosition[1]--;
            if (positionIsRock(roverPosition)) {
                roverPosition[1]++;
            }
        } else if (roverFacesNorth(roverPosition)) {
            roverPosition[1]++;
            if (positionIsRock(roverPosition)) {
                roverPosition[1]--;
            }
        } else if (roverFacesWest(roverPosition)) {
            roverPosition[0]++;
            if (positionIsRock(roverPosition)) {
                roverPosition[0]--;
            }
        } else if (roverFacesEast(roverPosition)) {
            roverPosition[0]--;
            if (positionIsRock(roverPosition)) {
                roverPosition[0]++;
            }
        }
    }

    public static void turnRoverLeft() {

        int[] roverPosition = findeRover();

        if (roverFacesNorth(roverPosition))
            planetCommands.mars.put(roverPosition, "west");
        else if (roverFacesSouth(roverPosition))
            planetCommands.mars.put(roverPosition, "east");
        else if (roverFacesEast(roverPosition))
            planetCommands.mars.put(roverPosition, "north");
        else if (roverFacesWest(roverPosition))
            planetCommands.mars.put(roverPosition, "south");
    }

    public static void turnRoverRight() {

        int[] roverPosition = findeRover();

        if (roverFacesWest(roverPosition))
            planetCommands.mars.put(roverPosition, "north");
        else if (roverFacesEast(roverPosition))
            planetCommands.mars.put(roverPosition, "south");
        else if (roverFacesNorth(roverPosition))
            planetCommands.mars.put(roverPosition, "east");
        else if (roverFacesSouth(roverPosition))
            planetCommands.mars.put(roverPosition, "west");
    }

    public static void moveRover(char moveCommand) {
        if (moveCommand == 'f') {
            moveRoverForward();
        } else if (moveCommand == 'b') {
            moveRoverBackward();
        } else if (moveCommand == 'l') {
            turnRoverLeft();
        } else if (moveCommand == 'r') {
            turnRoverRight();
        }

    }

    private static int[] findeRover() {
        Set<Map.Entry<int[], String>> entrySet = rover.planetCommands.mars.entrySet();
        for (Map.Entry<int[], String> entry : entrySet) {
            if (entry.getValue() != null && !entry.getValue().equals("#"))
                return entry.getKey();
        }
        throw new IllegalStateException("Rover missing in action");
    }

}
