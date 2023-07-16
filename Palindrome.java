package first;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner dead = new Scanner(System.in);
		int n = dead.nextInt();
		int s = 0;
		int p = n;
		while(n!=0) {
			s = s*10+n%10;
			n = n/10;
		}
		System.out.println(s);
		if (p==s) {
			System.out.println("entered nmbr is a palindrome");
		}
		else {
			System.out.println("entered nmbr is not a palindrome");
		}

	}

	
}
