public class RowerElektryczny extends Pojazd{

    public RowerElektryczny(String id, String model, boolean czyDostepny) {
        super(id, model, czyDostepny);
    }

    @Override
    public double obliczKoszt(int godziny) {
        return godziny * 20.0;
    }
}
