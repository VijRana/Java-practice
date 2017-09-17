package com.besant.java.intro;

@Reviewed(reviewer = "Joe Smith", date = 20050331)
public class Point {
	public double x, y;

	public void clear() {
		x = 0.0;
		y = 0.0;
	}
	public double distance(Point that) {
		double xdiff = x - that.x;
		double ydiff = y - that.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
		}

	public static void main(String[] args) {
		Point lowerLeft = new Point();
		Point upperRight = new Point();
		Point middlePoint = new Point();
		lowerLeft.x = 0.0;
		lowerLeft.y = 0.0;
		upperRight.x = 1280.0;
		upperRight.y = 1024.0;
		middlePoint.x = 640.0;
		middlePoint.y = 512.0;
		
		double d = lowerLeft.distance(upperRight);
	}
}
