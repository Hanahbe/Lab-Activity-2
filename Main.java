public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle vehicle2 = new Vehicle("Ford", "Mustang", 2010);
        Vehicle vehicle3 = new Vehicle("Honda", "Civic", 1995);

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        vehicle1.setYear(2030);

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        vehicle2.setYear(2021);

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        vehicle3.setYear(2019);
    }
}