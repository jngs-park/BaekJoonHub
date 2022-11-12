import java.util.Scanner;

public class Main{

public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int cnt = 0;
     int[] arr = new int[N];
     
     for(int i=0; i<N; i++) {
    	 arr[i]=sc.nextInt();
    	 
     }
     int num = sc.nextInt();
     for(int j=0; j<N; j++) {
    	 if(arr[j] == num) {
    		 cnt++;
    	 }
     }
     System.out.println(cnt);
}    
}