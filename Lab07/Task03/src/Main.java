import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz które zadanie chcesz rozwiązać: \n1 - Zadanie 1. \n2 - Zadanie 2. \n3 - Zadanie 3. " +
                 "\n4. Wyjście. \n\nNumer zadania: ");

        int wybor = scanner.nextInt();

        switch (wybor){
            case 1:
                tasks.Task01();
                break;

            case 2:
                tasks.Task02();
                break;

            case 3:
                tasks.Task03();
                break;

            case 4:
                System.out.println("Zakończenie programu.");
                break;

            default:
                System.out.println("Wprowadzono niepoprawne dane!");
                break;
        }
    }
}