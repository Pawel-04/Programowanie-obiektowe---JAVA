public class Okrag extends Figura{
    Punkt srodek;
    double promien;

    double getPowierzchnia() {
        return Math.PI * promien * promien;
    }

    double getSrednica() {
        return promien * 2;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double p) {
        this.promien = p;
    }

    public boolean wSrodku(Punkt p) {
        int dx = p.getX() - srodek.getX();
        int dy = p.getY() - srodek.getY();
        double odlegloscKwadrat = dx * dx + dy * dy;
        return odlegloscKwadrat <= promien * promien;
    }

    public Okrag() {
        this.srodek = new Punkt(0, 0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }
}