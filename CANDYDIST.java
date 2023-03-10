// https://www.codechef.com/problems/CANDYDIST
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
		    float n = s.nextInt();
		    float m = s.nextInt();
		    float count = n/m;
            if(n%2==0){
                if(count%2==0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
            
		}
	}
}
