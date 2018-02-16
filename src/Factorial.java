import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = in.nextInt();
		int result=1;
		
		for(int i=1;i<=a;i++) {
			
				result=result*i;
		}
		System.out.println(result);
		
		 int factorial = fact(a);
	      System.out.println("Factorial of "+a+" is: "+factorial);
	}
	static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       //Recursion: Function calling itself!!
	       output = fact(n-1)* n;
	       return output;
	   }
}

