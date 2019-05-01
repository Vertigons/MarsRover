package rover;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class planetCommands {

    static int planetWidth = 80;
    static int planetHeight = 20;
    static int roverPositionX = planetWidth / 2;
    static int roverPositionY = planetHeight / 2;

    static Random randomNumber = new Random();
    static LinkedHashMap<int[], String> mars = new LinkedHashMap<>();

    public static void createPlanet() {

        for (int i = 0; i < planetWidth; i++) {
            for (int j = 0; j < planetHeight; j++) {
                int[] planet = new int[] { i, j };
                if (randomNumber.nextDouble() < 0.25 && !isRoverPosition(i, j))
                    mars.put(planet, "#");
            }
        }
    }

    public static void positionRover() {

        mars.put(new int[] { roverPositionX, roverPositionY }, "north");
    }

    public static boolean isRoverPosition(int i, int j) {

        return (roverPositionX == i && roverPositionY == j);
    }

    public static void drawPlanet() {
        // Set<int[]> keySet = mars.keySet();
        // for (int[] e : keySet) {
        // if (e[0] == 39 && e[1] == 10)
        // System.err.println(mars.get(e) + " " + e.hashCode());
        // }

        for (int j = 0; j < planetHeight; j++) {
            for (int i = 0; i < planetWidth; i++) {
                //System.drawPlanet.println(i + "," + j + ": " + get(mars, new int[] { i, j }));

                int[] currentPosition = new int[] {i, j};



                if (get(mars, currentPosition) == null) {
                    System.out.print(" ");
                    continue;
                }
                else if (get(mars, currentPosition).equals("#"))
                    System.out.print("#");


                else if (get(mars, currentPosition).equals("north"))
                    System.out.print("^");
                else if (get(mars, currentPosition).equals("south"))
                    System.out.print("V");
                else if (get(mars, currentPosition).equals("east"))
                    System.out.print(">");
                else if (get(mars, currentPosition).equals("west"))
                    System.out.print("<");

            }
            System.out.println();
        }
        for (int i = 0; i < planetWidth; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static String get(Map<int[], String> kloetze, int[] p) {
        Set<Map.Entry<int[], String>> entrySet = kloetze.entrySet();
        for (Map.Entry<int[], String> entry : entrySet) {
            if (entry.getKey()[0] == p[0] && entry.getKey()[1] == p[1])
                return entry.getValue();
        }
        return null;
    }

}