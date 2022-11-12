import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = 0;
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
            
            if (arr[i] > max) {
                
                max = arr[i];
            }
        }
        for (int j = 0; j < n; j++) {
            
            sum = sum + (arr[j] / max * 100);
        }
        System.out.println(sum / n);
    }
}