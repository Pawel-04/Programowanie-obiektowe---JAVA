package Klasy;

public class Osoba {
    private String imie, nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba() {
    }
    public void pokazDane(){
        System.out.println("Imię: "+imie+ "\tNazwisko: "+nazwisko+"\tWiek: "+wiek);
    }
}
