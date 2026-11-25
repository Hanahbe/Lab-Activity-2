public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void performService(Serviceable item) {
        item.Service();
    }

    public static void main(String[] args) {
        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Mercedes-Benz", "C-Class", 2024, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        // The Same Variable now Refer to a Motorcycle Object.
        vehicle = new Motorcycle("Suzuki", "Burgman Street 125EX", 2024, "4-Stroke, Single-Cylinder");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);

        // DEMO 2: One Method accepts different Vehicle subclasses
        System.out.println("\n === 2. Method Parameter ===");
        Car car = new Car("Nissan", "Almera", 2024, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Nmax 155", 2024, "4-Stroke, Single-Cylinder");
        Truck truck = new Truck("UD Trucks", "Quester", 2023, 10);
        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        performService((Serviceable) car);
        System.out.println();
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        System.out.println();
        performService((Serviceable) motorcycle);
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();
        performService((Serviceable) truck);

        // DEMO 3: One array holds different Vehicle subclasses
        System.out.println("\n === 3. Polymorphic Array ===");
        Vehicle[] vehicles = {
                new Car("Subaru", "WRX", 2023, 4),
                new Motorcycle("Honda", "Click 125i", 2024, "4-stroke, single-cylinder"),
                new Truck("Hino", "300 Series", 2023, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }

        Serviceable[] serviceables = {
                new Car("Subaru", "WRX", 2023, 4),
                new Motorcycle("Honda", "Click 125i", 2024, "4-stroke, single-cylinder"),
                new Truck("Hino", "300 Series", 2023, 6),
                new Printer()
        };

        for (Serviceable currentServiceable : serviceables) {
            performService(currentServiceable);
            System.out.println();
        }
    }
}
