import java.util.*;
import java.lang.*;
import java.io.*;

class DELARR77
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int c[] = new int[n];
		    for(int i = 0; i < n; i++){
		        a[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n; i++){
		        c[i] = sc.nextInt();
		    }
		    int minC = Integer.MAX_VALUE;
            long sum = 0;

            for(int i = 0; i < n; i++){
                minC = Math.min(minC, c[i]);
                sum += (long) a[i] * minC;
            }

            System.out.println(sum);
		    
		}

	}
}
