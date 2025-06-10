import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tasks {
    Scanner scanner = new Scanner(System.in);

    protected void Task01() {
        System.out.println("Wprowadź tekst: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("[^a-zA-ZąćęłńóśżźżĄĆĘŁŃÓŚŹŻ ]", "").toLowerCase();
        String[] words = cleanedInput.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    protected void Task02() {
        Users system = new Users();

        while (true) {
            System.out.println("Wybierz opcję: 1 - Dodaj użytkownika, 2 - Logowanie, 3 - Wyjście");
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    System.out.println("Podaj login: ");
                    String newLogin = scanner.nextLine();
                    System.out.println("Podaj hasło: ");
                    String newPassword = scanner.nextLine();
                    system.addUser(newLogin, newPassword);
                    break;

                case "2":
                    System.out.println("Login: ");
                    String login = scanner.nextLine();
                    System.out.println("Hasło: ");
                    String password = scanner.nextLine();
                    system.loginUser(login, password);
                    break;

                case "3":
                    System.out.println("Koniec programu.");
                    return;

                default:
                    System.out.println("Nieznana opcja, spróbuj ponownie.");
            }
        }
    }

    protected void Task03() {
        Menu system = new Menu();

        while (true) {
            System.out.println("\nWybierz opcję: 1 - Dodaj danie, 2 - Pokaż kartę, 3 - Usuń danie, 4 - Oblicz rachunek, 5 - Wyjście");
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    System.out.println("Nazwa dania: ");
                    String name = scanner.nextLine();
                    System.out.println("Cena: ");
                    try {
                        double price = Double.parseDouble(scanner.nextLine());
                        system.addDish(name, price);
                    } catch (NumberFormatException e) {
                        System.out.println("Niepoprawna cena.");
                    }
                    break;

                case "2":
                    system.showMenu();
                    break;

                case "3":
                    System.out.println("Podaj nazwę dania do usunięcia: ");
                    String dishToRemove = scanner.nextLine();
                    system.removeDish(dishToRemove);
                    break;

                case "4":
                    System.out.println("Podaj nazwy dań oddzielone przecinkiem: ");
                    String input = scanner.nextLine();
                    String[] dishes = input.split("\\s*,\\s*");
                    system.calculateBill(dishes);
                    break;

                case "5":
                    System.out.println("Koniec programu.");
                    return;

                default:
                    System.out.println("Nieznana opcja, spróbuj ponownie.");
            }
        }
    }
}
