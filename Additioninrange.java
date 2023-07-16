package first;
import java.util.Scanner;

public class Additioninrange {

	private static Scanner me;

	public static void main(String[] args) {
		System.out.println("enter two nmbrs");
		me = new Scanner(System.in);
		int n = me.nextInt();
		int k = me.nextInt();
		int s = 0;
		for (int i = n;i<=k;i++){
			s= s+i;
		}
		System.out.println("addition of nmbrs in range of"+n+"and"+k+"is"+s);
		
		

	}

}
