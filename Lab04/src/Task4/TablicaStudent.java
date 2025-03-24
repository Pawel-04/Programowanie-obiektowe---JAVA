package Task4;

import Klasy.Student;

import java.util.Scanner;

public class TablicaStudent {
    private  Student[] studenci;
    private  Scanner scanner;

    public TablicaStudent() {
        this.studenci = new Student[100];
        this.scanner = new Scanner(System.in);
        wypelnijTablice();
    }

    private void wypelnijTablice() {
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student("", "", "", i, 0);
        }
    }

    // Wprowadzanie danych studenta pod dany indeks
    public void wprowadzDane(int indeks) {

        System.out.println("Podaj imię:");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj specjalność:");
        String specjalnosc = scanner.nextLine();

        System.out.println("Podaj rok studiów:");
        int rok = scanner.nextInt();
        scanner.nextLine();

        studenci[indeks] = new Student(imie, nazwisko, specjalnosc, indeks, rok);
        System.out.println("Dane studenta zostały zapisane.");
    }

    // Edytowanie danych studenta pod danym indeksem
    public void edytujDane(int indeks) {
        System.out.println("Edytowanie studenta o indeksie: " + indeks);
        wprowadzDane(indeks);
    }

    // Usuwanie studenta (resetowanie do wartości domyślnych)
    public void usunStudenta(int indeks) {
        studenci[indeks] = new Student("", "", "", indeks, 0);
        System.out.println("Student usunięty.");
    }

    // Wyświetlanie jednego studenta
    public void pokazStudenta(int indeks) {
        studenci[indeks].pokazDaneStudenta();
    }

    // Wyświetlanie wszystkich studentów
    public void pokazWszystkichStudentow() {
        for (int i = 0; i < studenci.length; i++) {
            System.out.print("[" + i + "] ");
            studenci[i].pokazDaneStudenta();
        }
    }

    // Wyświetlanie zakresu studentów
    public void pokazZakresStudentow(int poczatek, int koniec) {
        if (poczatek > koniec) {
            int temp = poczatek;
            poczatek = koniec;
            koniec = temp;
        }

        for (int i = poczatek; i <= koniec; i++) {
            System.out.print("[" + i + "] ");
            studenci[i].pokazDaneStudenta();
        }
    }

    // Metoda główna do testowania
    public static void main(String[] args) {
        TablicaStudent manager = new TablicaStudent();
        manager.wprowadzDane(1);
        manager.wprowadzDane(3);
        manager.edytujDane(2);
        manager.pokazStudenta(2);
        manager.usunStudenta(2);
        manager.pokazZakresStudentow(0, 5);
    }
}
