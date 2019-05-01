package rover;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class planetCommands {

    private static int planetWidth = 80;
    private static int planetHeight = 20;
    private static int roverPositionX = planetWidth / 2;
    private static int roverPositionY = planetHeight / 2;

    static Random randomNumber = new Random();
    private static String[][] mars = new String[planetHeight][planetWidth];



    public void initializePlanet() {
        for (int i = 0; i < mars.length; i++) {
            for (int j = 0; j < mars[i].length; j++) {
                if (randomNumber.nextDouble() < 0.25 && i != 10 && j != 40) {
                    mars[i][j] = "#";
                }
                else
                    mars[i][j] = " ";

            }
        }
    }

    public  void initializeRover() {
        mars[planetHeight / 2][planetWidth / 2] = "^";
    }


    public void printPlanet() {
        for (String[] a : mars) {
            for (String i : a) {
                System.out.print(i + " " );
            }
            System.out.println(" ");
        }
        for (int i = 0; i < planetWidth; i++) {
            System.out.print("= ");
        }
        System.out.println("");

    }

    public void createPlanet() {

        initializePlanet();
        initializeRover();
        printPlanet();


    }

    public int getRoverPositionX() {
        return roverPositionX;
    }
    public int getRoverPositionY() {
        return roverPositionY;
    }
    public void setRoverPositionX(int x) {
        roverPositionX = x;
    }
    public void setRoverPositionY(int y) {
        roverPositionY = y;
    }

    public String[][] getPlanet() {
        return mars;
    }
    

}
