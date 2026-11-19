package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    private final int iloscBiegow = 6;
    private int AktualnyBieg;
    private Sprzeglo sprzeglo;
    public SkrzyniaBiegow(String producent, String model), Sprzeglo sprzeglo){
    super(producent,model);
    this.AktualnyBieg = 0;
    }


}
