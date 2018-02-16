import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

		/*	//int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       Scanner in = new Scanner(System.in);
			int s;
			System.out.println("Enter number:");
			s = in.nextInt();

	       for (int i = 1; i <= s; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+s+" are :");
	       System.out.println(primeNumbers);*/



		int num1=0;
		int n=0;
		String primenumber1="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = in.nextInt();
		
		for(int j=1;j<=a;j++) {
			int count1=0;
			for(num1=j;num1>=1;num1--) {
				if(j%num1==0) {
					count1=count1+1;
				}
			}
			if(count1==2) {
				primenumber1=primenumber1+j+" ";
				 n=n+1;
			}

		}
		System.out.println("Prime numbers from 1 to "+a+" are :");
		System.out.println(primenumber1);
		System.out.println("Number of primenumbers are : "+n);
	}



}
