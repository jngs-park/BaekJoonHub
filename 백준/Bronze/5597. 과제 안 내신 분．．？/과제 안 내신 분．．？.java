import java.util.Scanner;

public class Main{

public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int n;
     
     
     boolean[] arr = new boolean[30];
     
     for(int i=0; i<28; i++) {
    
    	 n = sc.nextInt();
    	 arr[n-1] = true;
    	 
     }
     
     for(int j=0; j< 30; j++) {
    	 if(arr[j] == false) {
    		 System.out.println(j+1);
    	 }
    	sc.close();
     }
}    
}