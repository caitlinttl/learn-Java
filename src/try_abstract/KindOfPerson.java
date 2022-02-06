package try_abstract;

public class KindOfPerson implements Student, Employee {
    // 一個類可以實現多個接口, 不同接口之間用逗號隔開
    public void goToSchool() {
        System.out.println("我去上學");
    }

    public void takeExam() {
        System.out.println("我考試");
    }
    
    public void goToWork() {
        System.out.println("去上班");
    }
    
    public void getSalary() {
        System.out.println("領薪水");
    }
    
    
}
