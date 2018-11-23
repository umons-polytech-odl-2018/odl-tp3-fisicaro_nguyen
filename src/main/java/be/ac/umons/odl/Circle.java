package be.ac.umons.odl;

public class Circle extends Ellipsis {
	private Point Center;
	private int Radius;

	public Circle(Point Center, int Radius){
		super(Center,Radius,Radius);
	}
}
