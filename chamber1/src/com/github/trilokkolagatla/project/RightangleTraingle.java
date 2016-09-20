package com.github.trilokkolagatla.project;

public class RightangleTraingle {
	private static int side1=5;
	private static int side2=6;
	private static int side3=7;
	public int checkTraingle(int side1, int side2, int side3) {
		int max = 0;
		if (side1 >side2 && side1 > side3) {
			max = side1;
		} else if (side2 > side1 && side2 > side3) {
			max = side2;
		} else {
			max = side3;
		}
		if (max != 0) {
			if (max == side1) {
				if (side1 < side2 + side3) { 
					return 1;
				}
			} else if (max == side2) {
				if ((side2 < side1 + side3)) {
					return 1;
				}
			} else {
				if (side3 < side1 + side2) {
					return 1;
				}
			}
		}
		return 0;
	}
	public void print(int side1,int side2,int side3){
		int y=side1*side1;
		int x=side2*side2;
		int z=side3*side3;
		if(x+z==y)
		{
			System.out.println("it is a right angled traingle");
		}
		else if(y+z==x){
			System.out.println("it is a right angled traingle");
		}
		else if(z+x==y){
			System.out.println("it is a right angled traingle");
		}
		else{
			System.out.println("it is not a right angled traingle");
		}
	}
	public static void main(String[] args) {
		RightangleTraingle t=new RightangleTraingle();
		t.checkTraingle(side1, side2, side3);
		t.print(side1, side2, side3);
		
	}

}
