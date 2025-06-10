public class Main {

    public enum Swiatlo {
        CZERWONE("Stój!"), ŻÓŁTE("Uwaga!"), ZIELONE("Jedź!");
        private final String Komunikat;

        Swiatlo(String komunikat) {
            Komunikat = komunikat;
        }

        public String getKomunikat() {
            return Komunikat;
        }
    }

    public static void main(String[] args) {
        Swiatlo swiatlo = Swiatlo.CZERWONE;

        switch (swiatlo){
            case ZIELONE -> System.out.println("Jedź!");
            case ŻÓŁTE -> System.out.println("Uwaga!");
            case CZERWONE -> System.out.println("Stój!");
        }
    }
}