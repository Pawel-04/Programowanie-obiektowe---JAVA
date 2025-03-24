package Klasy;

import java.util.Scanner;

public class Klasa {
    public static void main(String[] args){
        System.out.println("Zadanie 3: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = input.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = input.nextLine();
        System.out.println("Podaj nazwę specjalności: ");
        String nazwaSpecjalnosci = input.nextLine();
        System.out.println("Podaj rok studiów: ");
        int rokStudiow = input.nextInt();
        System.out.println("Podaj numer indeksu: ");
        int indeks = input.nextInt();
        Student newStudent = new Student(imie,nazwisko, nazwaSpecjalnosci, indeks, rokStudiow);
        newStudent.pokazDaneStudenta();
    }
}