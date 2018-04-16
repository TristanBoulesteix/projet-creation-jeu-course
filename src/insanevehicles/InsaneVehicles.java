package insanevehicles;

public class InsaneVehicles {
	public static void main(String[] args) {
		InsaneVehiclesGame game = new InsaneVehiclesGame();
		try {
			game.play();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
