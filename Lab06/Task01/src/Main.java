public class Main {
    public static void main(String[] args) {
        Pojazd samochod = new Samochod("1234", "Toyota", true);
        Pojazd rower = new RowerElektryczny("1533", "BestBike", true);
        Pojazd hulajnoga = new HulajnogaElektryczna("4574", "HulajHulaj", false);

        samochod.wypozycz();
        System.out.println("Koszt wypożyczenia wynosi: " +samochod.obliczKoszt(200) +" zł.");
        samochod.zwroc();
        System.out.println("________________________________");

        rower.wypozycz();
        System.out.println("Koszt wypożyczenia wynosi: " +rower.obliczKoszt(10) +" zł.");
        rower.zwroc();
        System.out.println("________________________________");

        hulajnoga.wypozycz();
        System.out.println("Koszt wypożyczenia wynosi: " +hulajnoga.obliczKoszt(5) +" zł.");
        hulajnoga.zwroc();
    }
}