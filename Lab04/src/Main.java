import Klasy.Osoba;
import Klasy.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        Osoba osoba1 = new Osoba("Paweł", "Wołoszyn", 20);
        osoba1.pokazDane();
        Osoba osoba2 = new Osoba("Kacper", "Kozłowski", 21);
        osoba2.pokazDane();
        Osoba osoba3 = new Osoba("Dominik", "Półchłopek", 22);
        osoba3.pokazDane();

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Zadanie 2:");
        Student student1 = new Student("Kamil", "Nowak", "Informatyka", 123456, 2);
        Student student2 = new Student("Paweł", "Misiek");
        Student student3 = new Student(987654);
        Student student4 = new Student("Informatyka i Ekonometria", 234621);
        student1.pokazDaneStudenta();
        student2.pokazDaneStudenta();
        student3.pokazDaneStudenta();
        student4.pokazDaneStudenta();
        }
    }