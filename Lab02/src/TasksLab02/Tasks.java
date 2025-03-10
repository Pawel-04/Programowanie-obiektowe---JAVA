package TasksLab02;

import java.util.Random;
import java.util.Scanner;

public class Tasks {

    Scanner input = new Scanner(System.in);
    private Random random = new Random();

    protected double Task001(int LiczbaUczniow){
        int i = 1;
        double suma = 0;
        double srednia;
        while(i <= LiczbaUczniow) {
            System.out.println("Podaj liczbę punktów uzyskanych przez " +i +" " +"ucznia: ");
            double punkty = input.nextDouble();
            suma += punkty;
            i++;
        }
        srednia = suma/LiczbaUczniow;
        return srednia;
    }
    protected void Task002(){
        int lUjemnych = 0;
        int lDodatnich = 0;
        int lZero = 0;
        int SumaUjemnych = 0;
        int SumaDodatnich = 0;

        for(int i = 1; i<=10; i++) {
            System.out.println("Podaj " +i +" liczbę: ");
            int liczba = input.nextInt();
            if(liczba < 0) {
                SumaUjemnych += liczba;
                lUjemnych++;
            } else if(liczba > 0) {
                SumaDodatnich += liczba;
                lDodatnich++;
            } else {
                lZero++;
            }
        }
        System.out.println("Liczba cyfr ujemnych: " +lUjemnych +", liczba cyfr dodatnich: "
                +lDodatnich +", liczba podanych zer: " +lZero);
        System.out.println("Suma liczb ujemnych wyniosła: " +SumaUjemnych
                +", a suma liczb dodatnich: " +SumaDodatnich);
    }
    protected int Task003(int n) {
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Podaj: " +i +" liczbę: ");
            int liczba = input.nextInt();
            if(liczba % 2 == 0) {
                suma += liczba;
            }
        }
        return suma;
    }
    protected int Task004(int value) {
        int sumaParzystych = 0;

        System.out.println("Wylosowane liczby:");
        for (int i = 1; i <= value; i++) {
            int liczba = random.nextInt(56) - 10; // Losuje liczbę z przedziału (-10, 45)
            System.out.print(liczba + " ");

            if (liczba % 2 == 0) { // Sprawdzenie czy liczba jest parzysta
                sumaParzystych += liczba;
            }
        }
        return sumaParzystych;
    }
    protected boolean Task005() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String slowo = scanner.nextLine();

        // Zmieniamy słowo na małe litery
        slowo = slowo.toLowerCase();
        String odwroconeSlowo = new StringBuilder(slowo).reverse().toString();
        boolean czyPalindrom = slowo.equals(odwroconeSlowo);

        return czyPalindrom;
    }
}

