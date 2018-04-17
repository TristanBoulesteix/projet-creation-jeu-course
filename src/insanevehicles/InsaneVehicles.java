package insanevehicles;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InsaneVehicles {
	public static void main(String[] args) {
		InsaneVehiclesGame game;
		try {
			game = new InsaneVehiclesGame();
			game.play();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
