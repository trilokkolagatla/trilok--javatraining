package project;

public class Circuitening {
	public static void main(String[] args) {
 int x=7,y=9,z=11;
if(x>y&&++z==y)
{
	System.out.println("print jr ntr");
}
	if (x>y&++z==y)
	{
		System.out.println("correct");
	}
	if(x<y|++z==y)
	{
	System.out.println("print movie");
	}
if(x<y||++z==y)
{
	System.out.println("not correct");

}
System.out.println(x);
System.out.println(y);
System.out.println(z);
	}
}