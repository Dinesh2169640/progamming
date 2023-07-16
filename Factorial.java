package first;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter any numbr");
		@SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt();
		int s = 1;
		
		for (int i=n;i>=1;--i) {
			s= s*i;
			
		}
		System.out.println("factorial of"+n+"is"+ s);
				

	}

}
