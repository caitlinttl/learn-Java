package ex_inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void greet() {
        System.out.println("Meow~~ I am " + this.name);
    }

    
}
