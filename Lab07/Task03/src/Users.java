import java.util.HashMap;
import java.util.Map;

public class Users {
    Map<String, String> users = new HashMap<>();

    public void addUser(String login, String password) {
        if (users.containsKey(login)) {
            System.out.println("Użytkownik o takim loginie już istnieje.");
        } else {
            users.put(login, password);
            System.out.println("Dodano użytkownika: "+login);
        }
    }

    public void loginUser(String login, String password) {
        if (!users.containsKey(login)) {
            System.out.println("Nie ma takiego użytkownika.");
        } else {
            String tempPassword = users.get(login);
            if (tempPassword.equals(password)) {
                System.out.println("Zalogowano pomyślnie!");
            } else {
                System.out.println("Niepoprawne hasło!");
            }
        }
    }
}
