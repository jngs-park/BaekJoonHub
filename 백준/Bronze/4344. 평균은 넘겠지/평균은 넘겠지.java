import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        
        for (int i = 0; i < T; i++) {
            
            int N =sc.nextInt();
            int[] arr = new int[N];
            double sum = 0;
            
            for (int j = 0; j < N; j++) {
                
                int val = 0;
                arr[j] = sc.nextInt();             
                sum += arr[j];
            }
            double mean = (sum/N);
            double count = 0;
            
            for (int k = 0; k < N; k++) {
                
                if (arr[k] > mean) {
                    count++;
                }
                
            } System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}