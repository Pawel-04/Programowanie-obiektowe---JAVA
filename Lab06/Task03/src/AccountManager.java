import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager  implements AccountOperations {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int idCounter = 1;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.println("Wybierz typ konta: \n1. Regular\n2. Moderator\n3. Admin: ");
        int typ = Integer.parseInt(scanner.nextLine());


        System.out.println("Podaj nazwę użytkownika: ");
        String username = scanner.nextLine();
        System.out.println("Podaj email: ");
        String email = scanner.nextLine();
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        switch (typ) {
            case 1 -> {
                System.out.println("Ilość postów: ");
                int posts = Integer.parseInt(scanner.nextLine());
                accounts.add(new RegularUser(idCounter++, username, email, password, posts));
            }
            case 2 -> {
                System.out.println("Obsłużone raporty: ");
                int reports = Integer.parseInt(scanner.nextLine());
                accounts.add(new Moderator(idCounter++, username, email, password, reports));
            }
            case 3 -> {
                System.out.println("Admin level (1-3): ");
                int level = Integer.parseInt(scanner.nextLine());
                accounts.add(new Admin(idCounter++, username, email, password, level));
            }
            default -> System.out.println("Nieznany typ konta.");
        }
    }

    @Override
    public void viewAccounts() {
        for (Account acc : accounts) {
            System.out.println("ID: " + acc.getId() + " | ");
            acc.showProfile();
        }
    }

    @Override
    public void updateAccount(int id) {
        for (Account acc : accounts) {
            if (acc.getId() == id) {
                System.out.println("Nowy email: ");
                acc.setEmail(scanner.nextLine());

                System.out.print("Nowe hasło: ");
                acc.setPassword(scanner.nextLine());

                System.out.println("Zaktualizowano konto.");
                return;
            }
        }
        System.out.println("Nie znaleziono konta o ID: " + id);
    }

    @Override
    public void deleteAccount(int id) {
        accounts.removeIf(acc -> acc.getId() == id);
        System.out.println("Usunięto konto.");
    }
}
