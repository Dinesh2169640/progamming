package first;
import java.util.*;

public class Arthimatic {

	private static Scanner d;
	public static void main(String[] args) {
		d = new Scanner(System.in); 
		System.out.println("enter 2 numbers");
			int a = d.nextInt();
			int b = d.nextInt();
			int result = add(a,b);
			System.out.println("the addition: "+result);
			sub(a,b);
			mul(a,b);
			div(a,b);
			mod(a,b);
			

	}
	public static int add(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void sub(int a,int b) {
		System.out.println("the diff is: "+(a-b));
		
	}
	public static void mul(int a,int b) {
		System.out.println("the product is: "+(a*b));
		
	}
	public static void div(int a,int b) {
		System.out.println("the division is: "+(a/b));
		
	}
	public static void mod(int a,int b) {
		System.out.println("the reminder is: "+(a%b));
		
	}
	

}
