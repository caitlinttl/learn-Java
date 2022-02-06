
public class Student {
    String name;

    // 構建函數和this
    // 構建函數是一個對像在最先被調用的函數，每次創建實例的時候，它的構建函數都可以被調用
    // 構建函數不能有返回值，而且"函數名"必須和"類名"一致
    public Student(String name) { 
        this.name = name;
        // name = "Samuel";
    }
    public static void main(String[] args) { 
        Student student  = new Student("Apple");
        System.out.println(student.name); 
    }


    
}