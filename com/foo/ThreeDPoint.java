package com.foo;
import com.bar.Point;
public class ThreeDPoint extends Point 
{
	private int z;
	public ThreeDPoint(int x, int y, int z) 
	{
		super(x,y);
		this.z = z;
	}
	public static void main(String args[]) 
	{
		ThreeDPoint tdPoint = new ThreeDPoint(10,20,30);
		System.out.println(tdPoint);
	}
}