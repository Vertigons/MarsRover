package rover;

import java.util.Map;
import java.util.Set;

public class RoverCommands {

    public static planetCommands planetCommands = new planetCommands();

    public static boolean roverFacesSouth(int[] roverPosition) {
        return false;
    }

    public static boolean roverFacesNorth(int[] roverPosition) {
        return false;
    }

    public static boolean roverFacesEast(int[] roverPosition) {
        return false;
    }

    public static boolean roverFacesWest(int[] roverPosition) {
        return false;
    }

    public static boolean positionIsRock(int[] roverPosition) {
        return false;
    }

    public static void moveRoverForward() {


    }

    public static void moveRoverBackward() {


    }

    public static void turnRoverLeft() {


    }

    public static void turnRoverRight() {


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



}
