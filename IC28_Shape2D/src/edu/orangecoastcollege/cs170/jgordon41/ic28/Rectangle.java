package edu.orangecoastcollege.cs170.jgordon41.ic28;

public class Rectangle extends Shape2D {

	private int height, width; 
	
	public Rectangle(int height, int width, String color, int x, int y) {
		super(color, x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculatedArea() {
		return width*height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}
	
	public String toString(){
		String finals = "";
		
		for(int i = 1; i <= height;i++){
			for(int col = 1; col <= width; col++){
				finals += " * ";
			}
			finals += "\n";
		}
		
		String statement = "\nThe area of this rectangle is: " + calculatedArea() + " square units.";
		return finals + statement;
	}

}
