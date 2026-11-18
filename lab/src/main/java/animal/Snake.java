package animal;

public class Snake extends Animal {
    public Snake(String name){
        super(name, 0);
    }
    public void makeSound() {
        System.out.println(name + " syczy: Sssssss...");
    }
}
