import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();        
        String[] arr = new String[t];
       
        
        for (int i = 0; i < arr.length; i++) {
           
            arr[i] = sc.next();
        }
        
         for (int k = 0; k < arr.length; k++) {
              
              int count = 0;
              int point = 0;
             
           for (int j = 0; j < arr[k].length(); j++) {
             if (arr[k].charAt(j) == 'O') {
                count++;
              point = point + count;
            } else {
                 count = 0;
                 
             } 
                
       
           }
             
             System.out.println(point);
        } 
    }
}