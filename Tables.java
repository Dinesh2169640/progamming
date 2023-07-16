package first;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner you = new Scanner(System.in);
		int n = you.nextInt();
		int s = 0;
		int i=1;
		do {
			s=n*i;
			System.out.println(n+"x"+i+"="+s);
			i++;
			
		}
		while (i<=10);
		

	}

}
