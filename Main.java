public class Main{
    public static void main(String [] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Mitsubishi";
        vehicle1.model = "Montero Sport";
        vehicle1.year = 2021;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Hyundai";
        vehicle2.model = "Tucson";
        vehicle2.year = 2024;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Nissan";
        vehicle3.model = "Navara";
        vehicle3.year = 2023;

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage() + "\n");

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage() + "\n");

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());

    }
}