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
        Okrag okrag = new Okrag(punkt1, 4);
        Kwadrat kwadrat = new Kwadrat("niebieski", 7);

        System.out.println(figura.opis());
        System.out.println(prostokat.getPowierzchnia());
        trojkat.pole();
        System.out.println(okrag.wSrodku(punkt1));
        prostokat.przesun(3,5);
        System.out.println(kwadrat.opis() + " Pole: " + kwadrat.getPowierzchnia());
        System.out.println(prostokat.opis());
        System.out.println(trojkat.opis());
    }
}