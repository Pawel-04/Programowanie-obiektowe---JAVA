package TasksLab01;
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
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        int wybor = InputInt();
        switch (wybor){
            case 1:
                System.out.println(tasks.Task001());  // Wywołanie metody dla zadania 1
                break;
            case 2:
                System.out.print("Podaj pierwszą liczbę: ");
                int value1 = InputInt();
                System.out.print("Podaj drugą liczbę: ");
                int value2 = InputInt();
                tasks.Task002(value1, value2);  // Wywołanie metody dla zadania 2
                break;
            case 3:
                System.out.print("Podaj liczbę: ");
                int liczba3 = InputInt();
                System.out.println("Czy liczba " + liczba3 + " jest parzysta? " + tasks.Task003(liczba3));
                break;
            case 4:
                System.out.print("Podaj liczbę: ");
                int liczba4 = InputInt();
                System.out.println("Czy liczba " + liczba4 + " jest podzielna przez 3 i 5? " + tasks.Task004(liczba4));
                break;
            case 5:
                System.out.print("Podaj liczbę: ");
                int liczba5 = InputInt();
                System.out.println("Liczba " + liczba5 + " podniesiona do 3 potęgi: " + tasks.Task005(liczba5));
                break;
            case 6:
                System.out.print("Podaj liczbę: ");
                int liczba6 = InputInt();
                System.out.println("Pierwiastek kwadratowy z liczby " + liczba6 + ": " + tasks.Task006(liczba6));
                break;
            case 7:
                System.out.println("Podaj długości boków (a, b, c) trójkąta prostokątnego:");
                System.out.print("a: ");
                int a = InputInt();
                System.out.print("b: ");
                int b = InputInt();
                System.out.print("c: ");
                int c = InputInt();
                System.out.println("Czy z tych odcinków można zbudować trójkąt prostokątny? " + tasks.Task007(a, b, c));
                break;
            case 8:
                System.out.println("Koniec programu!");
                return;  // Zakończenie programu
            default:
                System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                break;
        }
    }

    //metdoa do wczytywania int
    private int InputInt(){
        int value = input.nextInt();
        return value;
    }

}
