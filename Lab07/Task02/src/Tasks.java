import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    Scanner scanner = new Scanner(System.in);

    protected void Task01() {
        Set<String> imiona = new HashSet<>();
        System.out.println("Wprowadź imiona (wpisz '-' aby zakończyć):");

        while (true) {
            System.out.print("Podaj imię: ");
            String imie = scanner.nextLine();

            if (imie.equals("-")) {
                break;
            }

            if (!imie.isEmpty()) {
                imiona.add(imie);
            }
        }
            System.out.println("Liczba unikalnych imion: " + imiona.size());
    }

    protected void Task02() {
        Map<String, String> pary = new HashMap<>();

        System.out.println("Wprowadzaj imiona par. Aby zakończyć, wpisz '-' jako imię.");
        while (true) {
            System.out.print("Podaj pierwsze imię: ");
            String imie1 = scanner.nextLine();
            if (imie1.equals("-")) break;

            System.out.print("Podaj drugie imię: ");
            String imie2 = scanner.nextLine();
            if (imie2.equals("-")) break;

            pary.put(imie1, imie2);
            pary.put(imie2, imie1);
        }

        if (pary.isEmpty()) {
            System.out.println("Nie wprowadzono żadnych par.");
        } else {
            System.out.print("Podaj jedno z wcześniej wprowadzonych imion: ");
            String zapytaneImie = scanner.nextLine();
            if (pary.containsKey(zapytaneImie)) {
                System.out.println("Partner(ka) to: " + pary.get(zapytaneImie));
            } else {
                System.out.println("Nie znaleziono takiego imienia.");
            }
        }
    }

    protected void Task03() {
        List<Uczestnik> uczestnicy = new ArrayList<>();
        uczestnicy.add(new Uczestnik(01,"Jan", 22));
        uczestnicy.add(new Uczestnik(02,"Maria", 12));
        uczestnicy.add(new Uczestnik(03,"Stefan", 42));
        uczestnicy.add(new Uczestnik(04,"Kamil", 15));

        System.out.println("Wszyscy uczestnicy: ");
        for (Uczestnik u : uczestnicy) {
            System.out.println(u);
        }

        System.out.println("");

        System.out.println("Uczestnicy pełnoletni: ");
        List<Uczestnik> pelnoletni = filtrujPelnoletnich(uczestnicy);
        for (Uczestnik u : pelnoletni) {
            System.out.println(u);
        }
    }

    public static List<Uczestnik> filtrujPelnoletnich(List<Uczestnik> lista) {
        return lista.stream()
                .filter(u-> u.getWiek() >= 18)
                .collect(Collectors.toList());
    }

    protected void Task04() {
        Produkt[] produktyArray = {
                new Produkt("Masło", 9.50),
                new Produkt("Kapusta", 4.30),
                new Produkt("Ziemniaki", 12.30),
                new Produkt("Mleko", 6.15),
                new Produkt("Chipsy", 4.99),
        };

        List <Produkt> listaProduktow = new ArrayList<>(Arrays.asList(produktyArray));
        System.out.println("Lista produktów: ");
        listaProduktow.forEach(System.out::println);

        List<Produkt> podlista = listaProduktow.subList(2,4);
        podlista.clear();

        System.out.println("\nLista po usunięciu podlisty: ");
        listaProduktow.forEach(System.out::println);
    }

    protected void Task05() {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(100);
        lista1.add(99);
        lista1.add(98);
        lista1.add(97);
        lista1.add(96);
        lista1.add(95);

        System.out.println("Lista 1: " +lista1);

        List<Integer> lista2 = new ArrayList<>();
        ListIterator<Integer> iterator = lista1.listIterator(lista1.size());
        while (iterator.hasPrevious()) {
            lista2.add(iterator.previous());
        }

        System.out.println("Odwrócona lista: " + lista2);
    }
}