package first;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("enter a number of more than two digits");
		Scanner rev = new Scanner(System.in);
		int n = rev.nextInt();
		int s = 0;
		//int p = 0;
		int r = 0;
		int v = n;
		while (n!=0) {
			s = s*10 + n%10;
			n = n/10;
			
		}
		System.out.println(s);

	}

}
