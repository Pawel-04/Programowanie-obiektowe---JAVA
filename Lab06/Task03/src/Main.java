import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                === MENU ===
                1. Dodaj konto
                2. Wyświetl konta
                3. Edytuj konto
                4. Usuń konto
                5. Wyjdź
            """);

            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1" -> manager.createAccount();
                case "2" -> manager.viewAccounts();
                case "3" -> {
                    System.out.print("Podaj ID konta do edycji: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    manager.updateAccount(id);
                }
                case "4" -> {
                    System.out.print("Podaj ID konta do usunięcia: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    manager.deleteAccount(id);
                }
                case "5" -> {
                    System.out.println("Koniec programu.");
                    return;
                }
                default -> System.out.println("Nieprawidłowa opcja.");
            }
        }
    }
}
