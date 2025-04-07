public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double maxSpeed;
    protected Engine engine;
    protected FuelTank fuelTank;

    public Vehicle(String brand, String model, int year, double maxSpeed, Engine engine, FuelTank fuelTank) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void displayInfo(){
        System.out.println("********* Pojazd ********\n"+
                "\nMarka: " +brand+
                "\nModel: " +model+
                "\nRok produkcji: " +year+
                "\nMaksymalna prędkość: " +maxSpeed);
    }

    public void startEngine(){
        engine.startEngine();
    }

    public void refuel (double amount) {
        fuelTank.refuel(amount);
    }

    public void consume (double amount) {
        fuelTank.consume(amount);
    }
}
