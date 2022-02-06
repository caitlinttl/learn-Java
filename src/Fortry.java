import java.io.File;
import java.io.IOException;

public class Fortry { 
    public static void main(String[] args) {  
        System.out.println("-----Hello World!-----");
        checkAge(17);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: You are old enough!");
        }    
    }

}
