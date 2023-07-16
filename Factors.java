package first;
import java.util.*;



public class Factors {
	public static void main(String []args) {
		System.out.println("enter any number");
		 Scanner fuck = new Scanner(System.in);
		 int n = fuck.nextInt();
		 
		 for (int i = 1;i<=n;i++) {
			 if (n%i==0)
				 System.out.print(i+" ");
		 }
	}

}
