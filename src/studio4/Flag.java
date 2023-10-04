package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		Color country = new Color (233, 42, 137);
		StdDraw.setPenColor(country);
		StdDraw.filledSquare(0.5,0.5,0.15);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.05);
		StdDraw.filledCircle(0.5,0.5,0.1);

	}
}