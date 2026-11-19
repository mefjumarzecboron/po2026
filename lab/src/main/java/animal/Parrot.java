package animal;

public class Parrot extends Animal {
    public Parrot(String name){
        super(name,2);
    }
    public void makeSound() {
        System.out.println(name + " śpiewa: Ćwir-ćwir!");
    }
}
