import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		//String s="Ram BHARATH";
		
		Scanner in = new Scanner(System.in);
		String s;
		System.out.println("Enter String :");
		s = in.nextLine();
		
		for (int i = s.length() - 1; i >= 0; i--) { 
			
			
			System.out.print(s.charAt(i)); 
			} 

		

	}
	

}
