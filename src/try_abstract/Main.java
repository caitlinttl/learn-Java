package try_abstract;

public class Main {

    public static void main(String[] args) {
        // Person person = new Person(); 
        // Cannot instantiate the type Person 無法給抽像類創建實例, 必須繼承它

        Teenager teenager = new Teenager();
        teenager.greet();
        teenager.sleep();

        KindOfPerson person = new KindOfPerson();
        person.goToSchool();
        person.takeExam();
        person.goToWork();
        person.getSalary();
    }
    
}
