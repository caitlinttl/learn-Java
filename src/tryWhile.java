import java.util.Scanner;

public class tryWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter number1: ");
            int num1 = scanner.nextInt();
            System.out.print("Please enter number2: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                break;
            }

            for (int i = num1; i <= num2; i++ ) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        
    }
    
}
