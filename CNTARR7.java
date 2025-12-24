import java.util.*;
import java.lang.*;
import java.io.*;

class CNTARR7
{
    static final long MOD = 998244353L;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    long n = sc.nextLong();
            long m = sc.nextLong();
		    if(n == 1){
		        System.out.println((m + 1) % MOD);
		        continue;
		    }
		    
		    long highestPower = Long.highestOneBit(m);

            long ans = 2 * (m - highestPower + 1);
            ans %= MOD;

            System.out.println(ans);
		}

	}
	

}
