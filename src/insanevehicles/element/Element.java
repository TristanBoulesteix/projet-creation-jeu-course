package insanevehicles.element;

public class Element {
	public final static char ROAD_OBSTACLE = 'X';
	public final static char ROAD_DITCH = '|';
	public final static char ROAD_MACADAM = ' ';
	public final static char MY_VEHICLE = 'H';

	private char sprite;

	public Element(char sprite) {
		setSprite(sprite);
	}

	public char getSprite() {
		return sprite;
	}

	private void setSprite(char sprite) {
		this.sprite = sprite;
	}
}
