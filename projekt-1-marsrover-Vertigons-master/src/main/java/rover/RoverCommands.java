package rover;

import java.util.Map;
import java.util.Set;

public class RoverCommands {

    static String direction = "^";

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
        if (direction == "^") {
            direction = "<";
        }
        else if (direction == "<") {
            direction = "V";
        }
        else if (direction == "V") {
            direction = ">";
        }
        else if (direction == ">") {
            direction = "^";
        }

    }

    public static void turnRoverRight() {
        if (direction == "^") {
            direction = ">";
        }
        else if (direction == "<") {
            direction = "^";
        }
        else if (direction == "V") {
            direction = "<";
        }
        else if (direction == ">") {
            direction = "V";
        }

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

    public void updateRoverPosition(String[][] s) {
        s[planetCommands.getRoverPositionY()][planetCommands.getRoverPositionX()] = direction;
    }



}
