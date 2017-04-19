package prob6;

public class Rectangle extends Shape implements Resizable{	

	public Rectangle(double width, double height) {
		this.setWitdth(width);
		this.setHeight(height);
	}
	@Override
	public double getArea() {
		return getWitdth() * getHeight();
	}

	@Override
	public double getPerimeter() {
	
		return (getWitdth() + getHeight())*2;
	}

	@Override
	public void resize(double arg) {
		this.setHeight(this.getHeight()*arg);
		this.setWitdth(this.getWitdth()*arg);
	}

}
