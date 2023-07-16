package first;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

} 
