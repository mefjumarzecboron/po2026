package agh.po.symulator;

    public class Silnik extends Komponent{
        private final int maxObroty = 6000;
        private int obroty;
        public Silnik(String producent,String model){
            super(producent,model);
            this.obroty = 0;
        }
        public void uruchom() {
            obroty = 950; //bieg jałowy
            System.out.println("silnik uruchomiony.");
            System.out.println("obroty = " + obroty);
        }
        public void zatrzymaj() {
            obroty = 0; //stop
            System.out.println("silnik zatrzymany.");
            System.out.println("obroty = " + obroty);
        }
        public void zwiekszObroty() {
            obroty = obroty + 100;
            if (obroty > maxObroty) obroty = maxObroty;
            System.out.println("obroty = " + obroty);
        }
        public void zmniejszObroty() {
            obroty = obroty- 100;
            if (obroty < 950) obroty = 950;
            System.out.println("obroty = " + obroty);
        }
        public int getObroty(){
            return obroty;
        }
    }

