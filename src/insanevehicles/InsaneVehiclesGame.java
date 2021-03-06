package insanevehicles;

import insanevehicles.element.Element;
import insanevehicles.element.mobile.MyVehicle;

public class InsaneVehiclesGame {
	final int ROAD_WIDTH = 9;
	final int ROAD_HEIGHT = 40;
	final int ROAD_VIEW = 23;
	final int ROAD_QUOTA = 20;
	final int ROAD_SPEED = 300;

	private Road road;
	private MyVehicle vehicle;

	public InsaneVehiclesGame() {
		setVehicle(new MyVehicle());
		setRoad(new Road(ROAD_WIDTH, ROAD_HEIGHT, ROAD_QUOTA, ROAD_VIEW, vehicle));
	}

	public void play() throws InterruptedException {
		char newPositionOnTheRoad = Element.ROAD_MACADAM;

		while ((newPositionOnTheRoad != Element.ROAD_OBSTACLE) && (newPositionOnTheRoad != Element.ROAD_DITCH)) {
			getRoad().show(vehicle.getY());
			Thread.sleep(ROAD_SPEED);
		}

	}

	public Road getRoad() {
		return road;
	}

	private void setRoad(Road road) {
		this.road = road;
	}

	public MyVehicle getVehicle() {
		return vehicle;
	}

	private void setVehicle(MyVehicle vehicle) {
		this.vehicle = vehicle;
	}
}
