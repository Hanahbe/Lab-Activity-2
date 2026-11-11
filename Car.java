public class Car extends Vehicle {
   private  int numberofDoors;

public Car (String brand, String model, int year, int numberofDoors){
    super(brand, model, year);
    this.numberofDoors = numberofDoors;
}
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberofDoors);
    }

    public void moveForward(){
        System.out.println("Car is Moving Forward");
    }

     public void moveBackward(){
        System.out.println("Car is Moving Backward");
    }

     public void moveLeft(){
        System.out.println("Car is Moving Left");
    }

     public void moveRight(){
        System.out.println("Car is Moving Right");
    }
     public void Service(){
        System.out.println("Car: Check Oil and brakes.");
     }
}