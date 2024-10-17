import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int[] input =new int[n];
        for(int i=0;i<n;i++){
          input[i]=sc.nextInt();
        }
      

        Map<Integer, Integer> multiplesCount = new HashMap<>();

       
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

       
        for (int number : input) {
           
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        System.out.println(multiplesCount);
    }
}
