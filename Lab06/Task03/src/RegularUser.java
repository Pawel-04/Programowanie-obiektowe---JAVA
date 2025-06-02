public class RegularUser extends Account{
    private int postsCount;

    public RegularUser(int id, String username, String email, String password, int postsCount) {
        super(id, username, email, password);
        this.postsCount = postsCount;
    }

    @Override
    public void showProfile() {
        System.out.println("Id użytkownika: " +id + " Nazwa użytkownika: " +username
                + " Email użytkownika: " +email + " Hasło użytkownika: " +password + " Liczba postów: " +postsCount);
    }
}
