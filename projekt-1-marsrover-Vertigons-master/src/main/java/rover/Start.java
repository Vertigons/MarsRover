package rover;

import java.util.Random;

public class Start {



	static Random randomNumber = new Random();
	public static planetCommands planetCommands = new planetCommands();
	public static RoverCommands roverCommands = new RoverCommands();









	public static void main(String[] args) {

		if (args.length > 1) {
			long seed = Long.parseLong(args[1]);
			randomNumber.setSeed(seed);
			// System.drawPlanet.println("Seed: " + seed);
		}
		planetCommands.createPlanet();
		planetCommands.positionRover();
		String positionCommands = args[0];
		planetCommands.drawPlanet();
		for (int i = 0; i < positionCommands.length(); i++) {
			roverCommands.moveRover(positionCommands.charAt(i));
			planetCommands.drawPlanet();
		}
	}



}
