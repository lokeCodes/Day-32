// https://www.codechef.com/problems/HIGHSCORE
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
		while(t-- > 0){
		    int n = s.nextInt();
		    int na = s.nextInt();
		    int nb = s.nextInt();
		    int nc = s.nextInt();
		    int nd = s.nextInt();
		    int res = Math.max(na,Math.max(nb,Math.max(nc,nd)));
		    System.out.println(res);
		  
		  //here the variable name is changed , to check the logic
		  
		  //if(a>=b && a>=c && a>=d){
		  //    System.out.println(a);
		  //}else if(b>=c && b>=d){
		  //    System.out.println(b);
		  //}else if(c>=d){
		  //    System.out.println(c);
		  //}else{
		  //    System.out.println(d);
		  //}
		  
		}
	}
}
