public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A3", 2001, 300, new Engine(110, "benzyna"), new FuelTank(60, 30), 5);
        car.displayInfo();
        System.out.println("\n");
        Truck truck = new Truck("Mercedes", "Actros", 2010, 160, new Engine(420, "diesel"), new FuelTank(350, 210), 2.5);
        truck.displayInfo();
        truck.startEngine();
        truck.refuel(30);
        truck.consume(50);
    }
}