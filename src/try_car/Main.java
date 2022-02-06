package try_car;

public class Main {
    
    public static void main(String[] args) {
        Car newCar = new Car("Haha");
        newCar.setModel("BMU");
        newCar.setYear(2022);
        System.out.println(newCar.getInfo());
    }
    
}
