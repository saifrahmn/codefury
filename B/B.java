import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int count = 0
		    for(int i = 0 ; i <= n ; i++){
		        int j;
		        for(j = 0 ; j > i ; j++){
		            if(s.charAt(i) != s.charAt(j)){
		                count++;
		            }
		        }
		        if(j && i){
		            count -= 2;
		        }
		    }
		    System.out.println(count);
		}
	}
}
