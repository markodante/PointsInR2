package com.Marko;

/**
 * @author Marko Orlando
 * ddate 06/11/2024 
 * Creating points in R2 and performing operations with them
 */


public class Point {

	/**
	 * Main Method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Point point1 = new Point(1, 2);
		Point point2 = new Point(3, 4);
		System.out.println("Point 1 is " + point1.toString());
		System.out.println("Point 1 has an x value of: " + point1.getX());
		System.out.println("Point 1 has an y value of: " + point1.getY());
		System.out.println("The distance between " + point1.toString() + ", and another point " + point2.toString()
				+ " is: " + point1.dist(point2));
		System.out.println("The midpoint between " + point1.toString() + " and " + point2.toString() + " is: "
				+ point1.midpoint(point2));
	}

	/**
	 * Instance variables
	 */
	private double x, y;

	// Constructors

	/**
	 * Default Constructor
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	// Constructor that sets points to whatever user passes in

	/**
	 * Creates a point on the xy axis
	 * 
	 * @param x The x coordinate of a point
	 * @param y The y coordinate of a point
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Accessor methods

	/**
	 * Determines the x coordinate of a point
	 * 
	 * @return The x coordinate
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * Determines the y coordinate of a point
	 * 
	 * @return The y coordinate
	 */
	public double getY() {
		return this.y;
	}

	// Other methods

	/**
	 * Determines the distance between two points on the xy plane
	 * 
	 * @param o The other point on the plane
	 * @return The distance between the two points
	 */
	public double dist(Point o) {
		double x2 = o.x - this.x;
		double y2 = o.y - this.y;
		return Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
	}

	/**
	 * Determines the midpoint between two points on the xy plane
	 * 
	 * @param o The other point on the plane
	 * @return The midpoint between the two points
	 */
	public Point midpoint(Point o) {
		double[] newPoint = new double[2];
		newPoint[0] = (this.x + o.x) / 2;
		newPoint[1] = (this.y + o.y) / 2;
		Point point = new Point(newPoint[0], newPoint[1]);
		return point;

	}

	/**
	 * Prints out the Point as a string
	 * 
	 * @return The point in the format "(x, y)"
	 */
	public String toString() {

		return "(" + this.x + ", " + this.y + ")";

	}

}