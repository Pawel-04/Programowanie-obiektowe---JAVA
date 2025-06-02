public class Adres {
    protected String ulica;
    protected int numerDomu;
    protected String kodPocztowy;
    protected String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) {

        String blad = "";

        if (ulica == null) {
            blad += "Ulica nie może być nullem. ";
        }
        if (numerDomu <= 0) {
            blad += "Numer domu musi być większy od zera. ";
        }
        if (kodPocztowy == null) {
            blad += "Kod pocztowy nie może być nullem. ";
        }
        if (miasto == null) {
            blad += "Miasto nie może być nullem.";
        }
        if (!blad.isEmpty()) {
            throw new NieprawidlowyAdresException(blad);
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public void pokazAdres(){
        System.out.println(ulica + " " + numerDomu + ", " + kodPocztowy + " " + miasto);
    }
}
