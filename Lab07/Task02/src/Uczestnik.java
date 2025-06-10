import java.util.Objects;

public class Uczestnik {

    protected int id;
    protected String imie;
    protected int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Dane uczestnika: " +
                "\nID: " + id +
                ", imię: " + imie +
                ", wiek: " + wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczestnik)) return false;
        Uczestnik that = (Uczestnik) o;
        return id == that.id && wiek == that.wiek && imie.equals(that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}
