package project;

		import java.util.Scanner;
		 
		public class Addition {
			public int returnSquare(int n){
				int sum =0;
			      for (int x=1;x<=n;x++) {
			        sum = sum +(x*x);
			      }
			      System.out.println(sum);
			      return sum;
			}
					 
		   public static void main(String[] args) {
		 
		      Scanner sc = new Scanner(System.in); 
		      System.out.print("Enter Integer: ");
		      int n = sc.nextInt();
		      Addition add=new Addition();
		      add.returnSquare(n);
		 
		   }
		
	}

