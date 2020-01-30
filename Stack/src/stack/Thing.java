package stack;

public class Thing {
	Color color;
	int myId;
	
	public Thing(int i) {
		myId = i;
		color = new Color(((i + 4) * 12345) % 4);
	}
	
	public Color getColor() {
		return color;
	}
	
	public String toString() {
		return "Thing " + myId + " " + color;
	}
}
         