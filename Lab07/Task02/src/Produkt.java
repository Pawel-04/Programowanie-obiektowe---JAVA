public class Produkt {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Dane produktu: " +
                "nazwa: " + nazwa +
                ", cena: " + cena;
    }
}
