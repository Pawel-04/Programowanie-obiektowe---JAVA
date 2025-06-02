public class Okrag extends Figura implements RuchFigury {

    int r;

    public Okrag(int r) {
        this.r = r;
    }

    @Override
    String opis() {
        return "Obiekt klasy Okrąg";
    }

    @Override
    void skaluj(float skala) {
        r *= (int) skala;
    }

    @Override
    public void przesun(int x, int y) {
        super.punkt.x += x;
        super.punkt.y += y;
    }
}
