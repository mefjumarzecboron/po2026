package agh.po.symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;
    public Sprzeglo(String producent,String model) {
        super(producent, model);
        this.stanSprzegla = false;
    }
    public void zwolnij() {
        stanSprzegla = false;
        System.out.println("puszczono sprzeglo");
    }
    public void wcisnij() {
        stanSprzegla = true;
        System.out.println("wcisnieto sprzeglo");
    }
    public boolean getstanSprzegla(){
        return stanSprzegla;
    }
}

