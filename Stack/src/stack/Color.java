package stack;

public class Color {
	public static int RED = 3;
	public static int BLUE = 2;
	public static int GREEN = 1;
	public static int YELLOW = 0;
 

    private int color;

    public Color(int value) {
        this.color = value;
    }
    
    public int getColor() { 
    	return color;
    }
    
    public String getColorString() {
    	switch(color) {
    	case 3:
    		return "RED";
    	case 2:
    		return "BLUE";
    	case 1:
    		return "GREEN";
    	case 0:
    		return "YELLOW";
    	default:
    		return "No such color";
    	}
    }
    
    public String toString() {
    	return getColorString();
    }
 }
