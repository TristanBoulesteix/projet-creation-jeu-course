package insanevehicles.element.mobile;

public class MyVehicle extends Mobile {
	private int x, y;

	public MyVehicle() {
		super(MY_VEHICLE);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
