package zipper;

public class conversion {
	public int d;
	public int t1;
	public long m;
	public int s;
	public void convert(int dd)
	{
		d = (int)dd;
	   t1 = (dd - d) * 60;
		m = (int)t1;
		s = (int) ((t1 - m) * 60);
		System.out.println("the value of result:"+s);
		System.out.println("the value of result:"+t1);
		System.out.println("the value of result:"+m);
}
	public static void main(String[] args){
		conversion c=new conversion();
		c.convert(30019);
	}

}
