import java.util.*;
import java.lang.*;
import java.io.*;

class COLLATZEZ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
            long n = sc.nextLong();
            boolean ok;
            if (n % 2 == 1) {
                ok = (n == 1 || n == 3);
            } else {
                if (n % 4 == 0) {
                    ok = true;
                } else {
                    long half = n / 2;
                    ok = (half == 1 || half == 3);
                }
            }
            System.out.println(ok ? "Yes" : "No");
        }
	}
}
