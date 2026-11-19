package animal;

public class Dog extends Animal {
    public Dog(String name){
        super(name, 4);
    }
    public void makeSound() {
        System.out.println(name + " szczeka: Hau hau!");
    }
}
