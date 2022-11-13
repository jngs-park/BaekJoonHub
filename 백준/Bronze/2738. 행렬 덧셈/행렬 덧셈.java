import java.util.Scanner;

public class Main{

public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     int N = sc.nextInt();
     int M = sc.nextInt();
     int[][] arr = new int[N][M];
     
     for(int i=0; i<N; i++) {
    	 for(int j=0; j<M; j++) {
    		 arr[i][j] = sc.nextInt();
    	 }
     }
     
     for(int k=0; k<N; k++) {
    	 for(int m=0; m<M; m++) {
    		 arr[k][m] += sc.nextInt();
    		 
    	 }	
     }
     for(int n=0; n<N; n++) {
    	 for(int o=0; o<M; o++) {
    		 
    		 System.out.print(arr[n][o]+" ");
    	 } System.out.println();	
     }
     
}    
}
