import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String, Double> menu = new HashMap<>();

    public void addDish(String name, Double price) {
        if (menu.containsKey(name)) {
            System.out.println("Takie danie już istnieje.");
        } else {
            menu.put(name, price);
            System.out.println("Dodano danie: "+name);
        }
    }

    public void showMenu() {
        if (menu.isEmpty()) {
            System.out.println("Karta dań jest pusta");
        } else {
            System.out.println("Karta dań: ");
            menu.forEach((name, price) -> System.out.println("# " + name + " - "+price+" zł"));
        }
    }

    public void removeDish(String name) {
        if (menu.containsKey(name)) {
            menu.remove(name);
            System.out.println("Usunięto danie: "+ name);
        } else {
            System.out.println("Nie znaleziono dania o nazwie: "+name);
        }
    }

    public void calculateBill (String[] dishes) {
        double total = 0;
        System.out.println("Rachunek za [");
        for (int i=0; i < dishes.length; i++) {
            String dish = dishes[i];
            if (menu.containsKey(dish)) {
                total += menu.get(dish);
                System.out.println(dish);
            } else {
                System.out.println(dish + " (brak w karcie dań)");
            }
            if (i< dishes.length -1) {
                System.out.println(", ");
            }
        }
        System.out.println("] " + total + " złotych");
    }
}
