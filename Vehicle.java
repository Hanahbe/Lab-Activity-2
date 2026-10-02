public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = (year >= 1886 && year <= 2026) ? year : 2026;
    }

    public int getYear(){
        return this.year;
    }

    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            System.out.println("Year is: " + year + "\n");
            this.year = year;
            return true;
        }else {        
            System.out.println("Year Remains: " + this.year + "\n");
            return false;
        }
    }

    public void displayInfo() {
        System.out.println(brand + " " + model + " " + getYear());
        
    }
    public int calculateAge() {
        return 2026 - getYear();
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}