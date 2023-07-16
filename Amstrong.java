package first;
import java.util.*;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = Count.getcount(n);
		int r = Count.getsum(n, p);
		if (n==r) {
			System.out.println("it is a armstrong nmbr");
		}else {
			System.out.println("it is not a armstrong nmbr");
		}

	}

}
