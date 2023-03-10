// https://www.codechef.com/problems/LASTLEVELS
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
		    int level = s.nextInt();
		    int ctime = s.nextInt();    //time to complete a level
		    int rtime = s.nextInt();    //time to rest
		    
		    int rest = level/3;         //number of times to rest
		    int ptime = level*ctime;    //play time for a level
		    int totalplaytime = (level%3==0) ? ptime+(rtime*(rest-1)) : ptime+(rtime*rest);
		    System.out.println(totalplaytime);
		}
	}
}
