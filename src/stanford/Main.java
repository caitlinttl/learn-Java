package stanford;
import harvard.Student;

public class Main {

    public static void main(String[] args) {

        Student hStudent = new Student();
        hStudent.greet();
        // 'greet()' is not public in 'harvard.Student'. Cannot be accessed from outside package
        // The method greet() from the type Student is not visible
        
    }
    
}
