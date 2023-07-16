package first;
import java.util.*;

public class Additiondigits {

	public static void main(String[] args) {
		System.out.println("enter any number of more than one digit");
		@SuppressWarnings("resource")
		Scanner free = new Scanner(System.in);
		int n = free.nextInt();
		int p = 0;
		int s = 0;
		while (n!=0) {
			s = n%10;
			n= n/10;
			p = p+s;
					
		}
		System.out.println(p);

	}

}

