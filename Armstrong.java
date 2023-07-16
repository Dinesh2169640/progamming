package first;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter any number");
		try (Scanner drug = new Scanner(System.in)) {
			int n = drug.nextInt();
			int s = 0;
			double q = 0;
			int p = n;
			int v = n;
			int x = 0;
			double r = 0;
			while (n!=0) {
				n = n/10;
				s++;
			}
			while (p!=0) {
				x = p%10;
				q = Math.pow(x, s);
				r = r+q;
				p = p/10;
			}
			int c = (int) r;
			if (v==c) {
				System.out.println("it is a armstrong number");
			}
			else {
				System.out.println("it is not a armstrong number");
			}
		}
		

	}

}
