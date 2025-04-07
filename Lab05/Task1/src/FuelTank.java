public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity, double currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void refuel (double amount) {
        if (amount > 0) {
            double temp = currentLevel + amount;
            System.out.println("Obecny stan paliwa wynosi: " + temp+ " litrów.");
        } else System.out.println("Nie wlano paliwa");
    }

    public void consume (double amount) {
        if (amount == currentLevel) {
            System.out.println("Zużyłeś całe paliwo, bak  jest pusty");
        } else if (amount < currentLevel) {
           double temp = currentLevel - amount;
           System.out.println("W baku zostało: "+temp+ " litrów paliwa.");
        } else System.out.println("Podana wartość jest zbyt duża.");
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }
}
