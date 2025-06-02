public class Admin extends Account{
    private int level;

    public Admin(int id, String username, String email, String password, int level) {
        super(id, username, email, password);
        this.level = level;
    }

    @Override
    public void showProfile() {
        System.out.println("Id użytkownika: " +id + " Nazwa użytkownika: " +username
                + " Email użytkownika: " +email + " Hasło użytkownika: " +password + " Poziom: " +level);
    }
}
