public class Main2 {

    public enum PizzaSize {
        MALA(30, 35.99), SREDNIA(40, 44.99), DUZA(50, 54.99);
        private final int Srednica;
        private final double cena;

        PizzaSize(int rozmiar, double cena) {
            this.Srednica = rozmiar;
            this.cena = cena;
        }

        public int getSrednica() {
            return Srednica;
        }

        public double getCena() {
            return cena;
        }
    }

    public static void main(String[] args) {

        System.out.println("Duża pizza ma średnicę: "+PizzaSize.DUZA.getSrednica() +" cm");
        System.out.println("Duża pizza kosztuje: "+PizzaSize.DUZA.getCena() +" złotych");
    }
}