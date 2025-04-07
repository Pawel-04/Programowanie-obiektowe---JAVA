public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, String model, int year, double maxSpeed, Engine engine, FuelTank fuelTank, double loadCapacity) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Maksymalna ładowność: " +loadCapacity +" ton");
    }
}


