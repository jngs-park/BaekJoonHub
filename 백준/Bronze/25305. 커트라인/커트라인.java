import java.util.Arrays;

import java.util.Scanner;
import java.io.FileInputStream;
 
class Main
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
       int N =sc.nextInt();
       int K = sc.nextInt();
       int[] arr =new int[N];
       
       
       for(int i=0; i<N; i++) {
    	   arr[i] = sc.nextInt();
    	   
       }
        Arrays.sort(arr);
        
        System.out.println(arr[arr.length-K]);
        
        	}
        	
        
        	  
       }