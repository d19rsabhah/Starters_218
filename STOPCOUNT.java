import java.util.*;
import java.lang.*;
import java.io.*;

class STOPCOUNT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    String bns = sc.next();
		    int chef = 0;
		    int antchef = 0;
		    int ways = 0;
		    
		   for(char ch : bns.toCharArray()){
		       if(ch == '1'){
		           chef++;
		       }else{
		           antchef++;
		       }
		       
		       if(chef > antchef){
		           ways++;
		       }
		   }
		   System.out.println(ways);
		}
	}
}
