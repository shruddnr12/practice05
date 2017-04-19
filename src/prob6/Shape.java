package prob6;

public abstract class Shape {
	private double witdth;
	private double height;
	
	public double getWitdth() {
		return witdth;
	}
	public void setWitdth(double witdth) {
		this.witdth = witdth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
