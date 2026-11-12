package animal;

public abstract class Animal {
    protected String name;
    protected int legs;

    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
}