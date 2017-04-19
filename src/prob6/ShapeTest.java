package prob6;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(5,6);
		Rectriangle rt = new Rectriangle(6,2);
		
		ArrayList<Shape> sh = new ArrayList<Shape>();
		sh.add(r);
		sh.add(rt);
		
		Iterator<Shape> it = sh.iterator();
		
		while(it.hasNext())
		{
			Shape s = it.next();
			System.out.println(s.getArea());
			System.out.println(s.getPerimeter());	
			
			if(s instanceof Rectangle)
			{
				
				((Rectangle) s).resize(0.5);
				System.out.println(s.getArea());
				System.out.println(s.getPerimeter());	
			}
			else
				break;
		}
	}

}
