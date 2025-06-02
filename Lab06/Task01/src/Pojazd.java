public abstract class Pojazd implements Wypozycalnia {
    protected String id;
    protected String model;
    protected boolean czyDostepny;

    public Pojazd(String id, String model, boolean czyDostepny) {
        this.id = id;
        this.model = model;
        this.czyDostepny = czyDostepny;
    }

    @Override
    public void wypozycz() {
        if (czyDostepny) {
            czyDostepny = false;
            System.out.println(model + " został wypożyczony.");
        } else {
            System.out.println(model + " jest już wypożyczony.");
        }
    }

    @Override
    public void zwroc() {
        if (!czyDostepny) {
            czyDostepny = true;
            System.out.println(model + " został zwrócony.");
        } else {
            System.out.println(model + " nie był wypożyczony.");
        }
    }

    public abstract double obliczKoszt(int godziny);

}