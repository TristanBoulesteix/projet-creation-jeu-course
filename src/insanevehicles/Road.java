package insanevehicles;

import java.util.Random;

import insanevehicles.element.Element;
import insanevehicles.element.mobile.MyVehicle;
import insanevehicles.element.motionless.Ditch;
import insanevehicles.element.motionless.Macadam;
import insanevehicles.element.motionless.Obstacle;

public class Road {
	int width, height, view, quota;
	MyVehicle vehicle;
	Element[][] road;

	public Road(int width, int height, int quota, int view, MyVehicle vehicle) {
		setWidth(width);
		setHeight(height);
		setQuota(quota);
		setView(view);
		setVehicle(vehicle);

		getVehicle().setX(width / 2);
		getVehicle().setY(0);

		road = new Element[getWigth()][getHeight()];

		fillOnTheRoad();
	}

	public void show(int yStart) {
		int y = yStart;
		int x, view;

		for (y = yStart, view = 0; view < getView(); y = (y + 1) % getHeight(), view++) {
			for (x = 0; x < getWigth(); x++) {
				System.out.print(getOnTheRoadXY(x, y).getSprite());
			}

			System.out.println();
		}
	}

	private void fillOnTheRoad() {
		int x, y;

		Random rand = new Random();

		for (y = 0; y < getHeight(); y++) {
			for (x = 0; x < getWigth(); x++) {
				if ((x == 0) || (x == getWigth() - 1)) {
					setOnTheRoadXY(new Ditch(), x, y);
				} else if (rand.nextInt() % getQuota() == 0) {
					setOnTheRoadXY(new Obstacle(), x, y);
				} else {
					setOnTheRoadXY(new Macadam(), x, y);
				}
			}
		}

		setOnTheRoadXY(getVehicle(), getVehicle().getX(), getVehicle().getY());
	}

	public int getWigth() {
		return width;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

	public int getView() {
		return view;
	}

	private void setView(int view) {
		this.view = view;
	}

	public int getQuota() {
		return quota;
	}

	private void setQuota(int quota) {
		this.quota = quota;
	}

	public MyVehicle getVehicle() {
		return vehicle;
	}

	private void setVehicle(MyVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Element getOnTheRoadXY(int x, int y) {
		return road[x][y];
	}

	public void setOnTheRoadXY(Element element, int x, int y) {
		road[x][y] = element;
	}
}
