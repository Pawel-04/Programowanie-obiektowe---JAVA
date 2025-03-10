package TasksLab02;
import java.util.Scanner;

public class RunTasks {

    Scanner input = new Scanner(System.in);
    //obiekt klasy Taks
    Tasks tasks = new Tasks();
    //metoda uruchomieniowa
    public void Run(){
        MenuView(); // wywołwanie metody do wyśwetlenia menu
    }

    //metoda do wyśweitlenia menu
    private void MenuView(){
        System.out.println("Laboratorium 1\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        int wybor = InputInt();
        switch (wybor) {
            case 1:
                System.out.println("Podaj liczbę uczniów: ");// Wywołanie metody dla zadania 1
                int LiczbaUczniow = InputInt();
                System.out.println("Średnia punktów w grupie laboratoryjnej wyniosła: " + tasks.Task001(LiczbaUczniow));
                break;
            case 2:
                tasks.Task002();  // Wywołanie metody dla zadania 2
                break;
            case 3:
                System.out.print("Podaj liczbę elementów w ciągu (n>0): ");
                int n = InputInt();
                if (n <= 0) {
                    System.out.println("Liczba elementów musi być większa od 0.");
                    break;
                }
                System.out.println("Suma liczb parzystych ciągu wyniosła: " + tasks.Task003(n));  // Wywołanie metody dla zadania 3
                break;
            case 4:
                System.out.print("Podaj liczbę elementów w ciągu (n>0): ");
                int value = InputInt();
                if (value <= 0) {
                    System.out.println("Liczba elementów musi być większa od 0.");
                    break;
                }
                System.out.println("Suma liczb parzystych ciągu wyniosła: " + tasks.Task004(value));  // Wywołanie metody dla zadania 4
                break;
            case 5:
                System.out.println("Czy to słowo jest palindromem: " +tasks.Task005());  // Wywołanie metody dla zadania 5
                break;
            case 6:
                System.out.println("Koniec programu!");
                return;  // Zakończenie programu
            default:
                System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                break;
        }
    }

    //metoda do wczytywania int
    public int InputInt(){
        int value = input.nextInt();
        return value;
    }
    public double InputDouble(){
        Double value = input.nextDouble();
        return value;
    }

}
