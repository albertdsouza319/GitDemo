package com.learning.corejava;

class Box
{
	double width;
	double hight;
	double depth;
}
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box a1= new Box();
		a1.width=10;
		a1.hight=20;
		a1.depth=30;
		double vol = a1.depth*a1.hight*a1.width;
		System.out.println("volume is "+vol);

	}

}
