// https://www.codechef.com/problems/BLACKJACK
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--> 0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int sum = x+y;
		    int z = 21-sum;
		    int res = (z<11 && z>0) ? z : -1;
		    System.out.println(res);
		}
	}
}
