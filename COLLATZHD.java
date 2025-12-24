import java.util.*;
import java.lang.*;
import java.io.*;

class COLLATZHD
{
	static final int INF = 1_000_000;
    static HashMap<Long, Integer> dp = new HashMap<>();

    static int solve(long n) {
        if (n == 1) return 0;
        if (n == 3) return 1;
        if ((n & 1) == 1) return INF; // odd > 3 impossible

        if (dp.containsKey(n)) return dp.get(n);

        int ans = INF;

        if (n % 4 == 2) {
            int sub = solve(n / 2);
            if (sub != INF) ans = 1 + sub;
        } else { // n % 4 == 0
            int sub1 = solve(n / 2);
            if (sub1 != INF) ans = 1 + sub1;

            if (n > 4) {
                int sub2 = solve(n / 2 + 2);
                if (sub2 != INF) ans = Math.min(ans, 2 + sub2);
            }
        }

        dp.put(n, ans);
        return ans;
    }
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            long N = Long.parseLong(br.readLine().trim());
            int res = solve(N);
            out.println(res >= INF ? -1 : res);
        }

        out.flush();
	}
}
