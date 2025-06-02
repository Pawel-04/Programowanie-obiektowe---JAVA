import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Laboratorium 8");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        String wybor = scanner.nextLine();

        switch (wybor) {
            case "1" -> {
                try {
                    System.out.println("Podaj liczbę: ");
                    double liczba = Double.parseDouble(scanner.nextLine());

                    if (liczba < 0) {
                        throw new IllegalArgumentException("Liczba nie może być ujemna");
                    }
                    if (liczba == 0){
                        throw new ArithmeticException("Nie można dzielić przez zero");
                    }
                    double pierwiastek = Math.sqrt(liczba);

                    System.out.println("Pierwiastek z "+liczba+ " = "+pierwiastek);
                }
                catch (NumberFormatException e) {
                    System.out.println("Błąd: Wprowadzone dane nie są liczbą");
                }
                catch (ArithmeticException e){
                    System.out.println("Błąd: Wprowadzona liczba jest równa 0");
                }
                catch (IllegalArgumentException e){
                    System.out.println("Błąd: " + e.getMessage());
                }
            }

            case "2" -> {
                try {
                    System.out.println("Podaj liczbę: ");
                    int n = Integer.parseInt(scanner.nextLine());

                    if (n < 0) {
                        throw new BlednaWartoscDlaSilniException("Liczba nie może być ujemna");
                    }

                    int wynik = Task02(n);
                    System.out.println("Silnia z " + n + " to: " +wynik);
                }catch (NumberFormatException e) {
                    System.out.println("Błąd: Wprowadzone dane nie są liczbą");
                }catch (BlednaWartoscDlaSilniException e){
                    System.out.println("Błąd: " + e.getMessage());
                }

            }
            case "3" -> {
                try {
                    Adres a1 = new Adres(null, 0, null, null);
                    a1.pokazAdres();
                } catch (NieprawidlowyAdresException e) {
                    System.out.println("Błąd przy tworzeniu adresu: " + e.getMessage());
                }

                try {
                    Adres a2 = new Adres("Pigonia", 1, "35-310", "Rzeszów");
                    a2.pokazAdres();
                } catch (NieprawidlowyAdresException e) {
                    System.out.println("Błąd przy tworzeniu adresu: " + e.getMessage());
                }
            }
            case "4" -> {
                System.out.println("Koniec programu.");
                return;
            }
            default -> System.out.println("Nieprawidłowa opcja.");
        }
    }

    public static int Task02(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Liczba nie może być ujemna");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * Task02(n - 1);
    }
}