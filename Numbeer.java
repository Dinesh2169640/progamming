package first;

import java.util.Scanner;

public class Numbeer {

	public static void main(String[] args) {
		System.out.println("enter any number grater than one digit");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		System.out.println("enter index of nmbr to print the digit");
		int m = num.nextInt();
		int s =  0;
		int r = n;
		while (n!=0) {
			n = n/10;
			s++;
		}
		if (s>=0||s<m) {
			System.out.println("given inputs are not right");
		}
		else {
			int p = s-m;
			for (int i = 1 ;i<=p;i++) {
				r=r/10;
				
			}
			r= r%10;
			System.out.println(r);
					
				
			
		}
			 
			
		
	}
}
