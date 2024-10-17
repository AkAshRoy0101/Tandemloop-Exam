import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        int number = 1;

    
        int termsToPrint = (a % 2 == 0) ? a - 1 : a;

   
        for (int i = 1; i <= termsToPrint; i += 2) {
            
            System.out.print(i);

            
            if (i < termsToPrint) {
                System.out.print(", ");
            }
        }
    }
}
