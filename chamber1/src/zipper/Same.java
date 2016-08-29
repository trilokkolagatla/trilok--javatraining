package zipper;

import java.util.Scanner;

public class Same {

public static int calcDistance(float latA, float longA, float latB, float longB) {

    double theDistance = (Math.sin(Math.toRadians(latA)) *
            Math.sin(Math.toRadians(latB)) +
            Math.cos(Math.toRadians(latA)) *
            Math.cos(Math.toRadians(latB)) *
            Math.cos(Math.toRadians(longA - longB)));

return new Double((Math.toDegrees(Math.acos(theDistance))) * 
	    69.09*1.6093).intValue();
}
public static void main(String[] args){
	Same s=new Same();
	Same.calcDistance(53, 55, 60, 65);
	
}
}