import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();
        int number = 1;
        for (int i = 1; i <= a; i++) {
          
            System.out.print(number);

            if (i < a) {
                System.out.print(", ");
            }
            number += 2;
        }
    }
}
