import java.util.Scanner;

public class ScanEx { 
    public static void main(String[] args) {  
        
        System.out.println("-----Hello World!-----");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
                System.out.println("sum = " + sum);
                continue;
            }
            scanner.nextLine();
            System.out.print("Do you want to continue?(Y/N): ");
            String response = scanner.nextLine();
            if(response.toLowerCase().charAt(0) == 'n') {
                break;
            }
        }
        System.out.println("Total sum = " + sum);        

    }
    



}
