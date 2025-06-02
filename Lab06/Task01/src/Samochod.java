public class Samochod extends Pojazd {

    public Samochod(String id, String model, boolean czyDostepny) {
        super(id, model, czyDostepny);
    }

    @Override
    public double obliczKoszt(int godziny) {
        return godziny * 125.0;
    }
}