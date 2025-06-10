import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> peselList = new ArrayList<>();
        ArrayList<String> datyUrodzenia = new ArrayList<>();
        int iloscKobiet = 0;
        int iloscMezczyzn = 0;
        int grupa1 = 0, sumaWiek1 = 0;
        int grupa2 = 0, sumaWiek2 = 0;
        int grupa3 = 0, sumaWiek3 = 0;
        double srednia1 = 0, srednia2 = 0, srednia3 = 0;

        try {
            File plik = new File("pesele.txt");
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                peselList.add(linia);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie znaleziony.");
            e.printStackTrace();
        }

        for (String pesel : peselList) {
            String rok = pesel.substring(0, 2);
            String miesiac = pesel.substring(2, 4);
            String dzien = pesel.substring(4, 6);

            int plecCyfra = Character.getNumericValue(pesel.charAt(9));
            String plec = (plecCyfra % 2 == 0) ? "Kobieta" : "Mężczyzna";

            if (plecCyfra % 2 == 0) {
                iloscKobiet++;
            } else {
                iloscMezczyzn++;
            }

            int dzienInt = Integer.parseInt(dzien);
            int miesiacInt = Integer.parseInt(miesiac);
            int rokInt = Integer.parseInt(rok);
            int rokPelny = 1900;

            if (miesiacInt >= 1 && miesiacInt <= 12) {
                rokPelny = 1900 + rokInt;
            } else if (miesiacInt >= 21 && miesiacInt <= 32) {
                miesiacInt -= 20;
                rokPelny = 2000 + rokInt;
            }

            String dataUrodzenia = String.format(rokPelny+"-"+miesiacInt+"-"+dzienInt);
            datyUrodzenia.add(dataUrodzenia);
            System.out.println("PESEL: " + pesel + "| Data urodzenia: " + rokPelny + "-" + miesiacInt + "-" + dzien + "| Płeć: \n" + plec);

            LocalDate birthDate = LocalDate.of(rokPelny, miesiacInt, dzienInt);
            int wiek = Period.between(birthDate, LocalDate.now()).getYears();

            if (rokPelny >= 1950 && rokPelny <= 1980) {
                grupa1++;
                sumaWiek1 += wiek;
            } else if (rokPelny >= 1981 && rokPelny <= 2000) {
                grupa2++;
                sumaWiek2 += wiek;
            } else if (rokPelny >= 2001 && rokPelny <= 2025) {
                grupa3++;
                sumaWiek3 += wiek;
            }

            if (grupa1>0) srednia1 = (double) sumaWiek1/grupa1;
            if (grupa2>0) srednia2 = (double) sumaWiek2/grupa2;
            if (grupa3>0) srednia3 = (double) sumaWiek3/grupa3;
        }
        System.out.println("Kobiet: " + iloscKobiet + " Mężczyzn: " + iloscMezczyzn);
        System.out.println("Ilość osób urodzonych w przedziałach: \n1950 - 1980: "+grupa1 +" osób, średnia wieku: "+srednia1+" lat, " +
                "\n1981 - 2000: "+grupa2 +" osób, średnia wieku: "+srednia2+" lat, \n2001 - 2025: "+grupa3 +" osób, średnia wieku: "+srednia3 +" lat.");

        zapisDoPliku(datyUrodzenia);
    }


    private static void zapisDoPliku(List<String> daty) {
        try (FileWriter writer = new FileWriter("wyniki.txt")) {
                for (String data : daty) {
                    writer.write(data + "\n");
                }
            System.out.println("\nRaport został zapisany do pliku 'wyniki.txt'.");
            }catch (IOException e) {
                System.out.println("Błąd zapisu do pliku: " + e.getMessage());
            }
        }
    }
