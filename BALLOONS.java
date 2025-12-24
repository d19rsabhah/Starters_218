import java.util.*;
import java.lang.*;

class BALLOONS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int ball[] = new int[n];
            int sum = 0;

            for(int i = 0; i < n; i++){
                ball[i] = sc.nextInt();
                sum += ball[i] * (i + 1);
            }

            System.out.println(sum);
        }

	}
}
