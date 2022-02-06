package ex_inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        // 調用了super(name)，
        // 這就意味著Dog調用了Animal父類的Animal(String name)函數，
        // 將自己的name數據初始化為參數name的數值。
    }
    public void greet() {
        System.out.println("WangWang..., I am " + this.name);
        // 對父類繼承來的方法進行修改
    }
    public void run() {
        System.out.println("I am running!");
        // 新增了一個方法run
    }

    public static void main(String[] args) {
        Dog newDog = new Dog("momo");
        // The constructor Dog() is undefined 的意思是有參數沒有傳入
        newDog.greet();
        
    }
}
