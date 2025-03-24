package Klasy;

public class Student {
    private String imie, nazwisko, nazwa_Specjalnosci;
    private int nr_Indeksu, rok_Studiów;

    public Student(String imie, String nazwisko, String nazwa_Specjalnosci, int nr_Indeksu, int rok_Studiów) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_Specjalnosci = nazwa_Specjalnosci;
        this.nr_Indeksu = nr_Indeksu;
        this.rok_Studiów = rok_Studiów;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String nazwa_Specjalnosci, int nr_Indeksu) {
        this.nazwa_Specjalnosci = nazwa_Specjalnosci;
        this.nr_Indeksu = nr_Indeksu;
    }

    public Student(int nr_Indeksu, int rok_Studiów) {
        this.nr_Indeksu = nr_Indeksu;
        this.rok_Studiów = rok_Studiów;
    }

    public Student(int nr_Indeksu) {
        this.nr_Indeksu = nr_Indeksu;
    }

    public void pokazDaneStudenta(){
        System.out.println("Imię: "+imie+ "\tNazwisko: "+nazwisko+"\tNazwa specjalnośći: "
                +nazwa_Specjalnosci+"\tNr indeksu: "+nr_Indeksu+"\tRok studiów: "+rok_Studiów);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwa_Specjalnosci() {
        return nazwa_Specjalnosci;
    }

    public void setNazwa_Specjalnosci(String nazwa_Specjalnosci) {
        this.nazwa_Specjalnosci = nazwa_Specjalnosci;
    }

    public int getNr_Indeksu() {
        return nr_Indeksu;
    }

    public void setNr_Indeksu(int nr_Indeksu) {
        this.nr_Indeksu = nr_Indeksu;
    }

    public int getRok_Studiów() {
        return rok_Studiów;
    }

    public void setRok_Studiów(int rok_Studiów) {
        this.rok_Studiów = rok_Studiów;
    }
}
