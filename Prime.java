package first;
import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int n = d.nextInt();
		int flag = 1;
		int i=2;
		if (n==0||n==1) {
			System.out.println("not prime");
		}
		if (n==2) {
			System.out.println("prime");
		}
		while (i<n) {
			if (n%i==0) {
				flag = 2;
				
			}
			i++;
		}
		if(flag == 1) {
			System.out.println(" prime");
		}else {
			System.out.println("not Prime");
		}

	}

}
