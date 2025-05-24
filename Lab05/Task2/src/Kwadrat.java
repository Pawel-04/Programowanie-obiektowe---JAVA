public class Kwadrat extends Prostokat{
    public Kwadrat(String kolor, double bok) {
        super(kolor, bok, bok);
    }

    public double getBok() {
        return szer;
    }

    public void setBok(double bok) {
        this.szer = bok;
        this.wys = bok;
    }

    @Override
    String opis() {
        return "To jest kwadrat o boku długości: " +getBok();
    }
}
