package first;

public class Count {
	static int  getcount(int n) {
		int c = 0;
		while(n!=0) {
			n = n/10;
			c++;
		}
		return c;
	}
  static int getsum(int n, int p) {
	  int s = 0;
	  if (n==0) {
		  return 0;
	  }
	  while (n!=0) {
		  int d = n%10;
		  int v = (int)Math.pow(d,p);
		  s = s+v;
	  }
	  return s;
	
  }
}
