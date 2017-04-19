package prob6;

public class Rectriangle extends Shape{
	
	public Rectriangle(double width, double height )
	{
		this.setWitdth(width);
		this.setHeight(height);
	}
	@Override
	public double getArea() {
		return getWitdth() * getHeight() / 2;
	}

	@Override
	public double getPerimeter() {
		double d = getWitdth()+getHeight() + Math.sqrt((Math.pow(getWitdth(), 2) + Math.pow(getHeight(), 2) ));
		return  d;
	}

}
