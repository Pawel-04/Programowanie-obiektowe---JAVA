public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(2,3);
        Punkt punkt2 = new Punkt(4,5);
        Punkt punkt3 = new Punkt(1,5);

        punkt1.opis();
        punkt1.zeruj();
        punkt1.opis();
        punkt2.opis();
        punkt2.przesun(4,2);
        punkt2.opis();
        punkt3.opis();

        Figura figura = new Figura("zielony");
        Prostokat prostokat = new Prostokat(12, 5);
        Trojkat trojkat = new Trojkat(10, 6);

        figura.opis();
        prostokat.getPowierzchnia();
        trojkat.opis

    }
}