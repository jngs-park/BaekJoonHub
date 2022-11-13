import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int[] arr;
        
        for (int i = 0; i < c; i++) {
            
            int n =sc.nextInt();
            arr = new int[n];
            
            double sum = 0;
            
            for (int j = 0; j < n; j++) {
                
                int val = 0;
                val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }
            double mean = (sum/n);
            double count = 0;
            
            for (int k = 0; k < n; k++) {
                
                if (arr[k] > mean) {
                    count++;
                }
                
            } System.out.printf("%.3f%%\n", (count/n)*100);
        }
    }
}