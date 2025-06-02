public class HulajnogaElektryczna extends Pojazd{

    public HulajnogaElektryczna(String id, String model, boolean czyDostepny) {
        super(id, model, czyDostepny);
    }

    @Override
    public double obliczKoszt(int godziny) {
        return godziny * 25.0;
    }
}
