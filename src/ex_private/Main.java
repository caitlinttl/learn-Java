package ex_private;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // System.out.println(student.name); 
        // Error !!
        // Student.name is not visible, because name is private
        
        System.out.println(student.getName()); // David
        
        student.setName("Enoch");
        System.out.println(student.getName()); // Enoch
    }
}