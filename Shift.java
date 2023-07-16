package first;

import java.util.Scanner;

public class Shift {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		@SuppressWarnings("unused")
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int b = n<<1;
		System.out.println(b);
		System.out.println(n>>2);

	}

}
