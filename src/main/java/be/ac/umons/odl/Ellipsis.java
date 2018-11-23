package be.ac.umons.odl;

import java.awt.*;

public class Ellipsis implements Drawable {

	private Point Center;
	private int Ax1,Ax2;

	public Ellipsis(Point Center, int Ax1, int Ax2){

		this.Ax1=Ax1;
		this.Ax2=Ax2;
		this.Center=Center;

	}

	public void draw (Graphics g) {

		g.drawOval(Center.getX(),Center.getY(),Ax1,Ax2);

	}
}
