import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int arr[] = new int[t];
        
        for (int x = 0; x < t; x++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr[x] = a + b;    
        }
        
        for (int y = 0; y < t; y++) {
            System.out.println(arr[y]);
        }
      
    }
}