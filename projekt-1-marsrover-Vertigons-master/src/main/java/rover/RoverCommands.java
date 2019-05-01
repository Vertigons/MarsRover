package rover;

import java.util.Map;
import java.util.Set;

public class RoverCommands {

    static String direction = "^";

    public static planetCommands planetCommands = new planetCommands();



    public  void moveRoverForward() {

        if (direction == "^") {
            moveRoverNorth();
        }
        else if (direction == "<") {
            moveRoverWest();

        }
        else if (direction == "V") {
            moveRoverSouth();
        }
        else if (direction == ">") {
            moveRoverEast();
        }

    }

    public  void moveRoverBackward() {

        if (direction == "^") {
            moveRoverSouth();
        }
        else if (direction == "<") {
            moveRoverEast();

        }
        else if (direction == "V") {
            moveRoverNorth();
        }
        else if (direction == ">") {
            moveRoverWest();
        }

    }

    public  void turnRoverLeft() {
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

    private  void moveRoverWest() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        if(!isRockWestOfRover()) {
            mars[roverPositionY][roverPositionX] = " ";
            planetCommands.setRoverPositionY(roverPositionY);
            planetCommands.setRoverPositionX(roverPositionX - 1);
            updateRoverPosition(mars);
        }

    }

    private void moveRoverEast() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        if (!isRockEastOfRover()) {
            mars[roverPositionY][roverPositionX] = " ";
            planetCommands.setRoverPositionY(roverPositionY);
            planetCommands.setRoverPositionX(roverPositionX + 1);
            updateRoverPosition(mars);
        }

    }

    private void moveRoverNorth() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        if(!isRockNorthOfRover()) {
            mars[roverPositionY][roverPositionX] = " ";
            planetCommands.setRoverPositionY(roverPositionY - 1);
            planetCommands.setRoverPositionX(roverPositionX);
            updateRoverPosition(mars);
        }

    }

    private void moveRoverSouth() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

            if(!isRockSouthOfRover()) {
                mars[roverPositionY][roverPositionX] = " ";
                planetCommands.setRoverPositionY(roverPositionY + 1);
                planetCommands.setRoverPositionX(roverPositionX);
                updateRoverPosition(mars);
            }

    }

    public  void moveRover(char moveCommand) {
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

    public boolean isRockWestOfRover() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        return mars[roverPositionY][roverPositionX - 1] == "#";
    }

    public boolean isRockEastOfRover() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        return mars[roverPositionY][roverPositionX + 1] == "#";
    }

    public boolean isRockNorthOfRover() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        return mars[roverPositionY - 1][roverPositionX] == "#";
    }

    public boolean isRockSouthOfRover() {
        String[][] mars = planetCommands.getPlanet();
        int roverPositionY = planetCommands.getRoverPositionY();
        int roverPositionX = planetCommands.getRoverPositionX();

        return mars[roverPositionY + 1][roverPositionX] == "#";
    }

    public void updateRoverPosition(String[][] s) {
        s[planetCommands.getRoverPositionY()][planetCommands.getRoverPositionX()] = direction;
    }



}
