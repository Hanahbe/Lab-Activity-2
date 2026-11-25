public class Truck extends Vehicle {
private int numberofWheels;

   public Truck(String brand, String model, int year, int numbofWheels){
       super(brand, model, year);
       this.numberofWheels = numbofWheels;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Number of wheels: " + numberofWheels);
      }

      public void moveForward(){
        System.out.println("Truck is Moving Forward");
    }

     public void moveBackward(){
        System.out.println("Truck is Moving Backward");
    }

     public void moveLeft(){
        System.out.println("Truck is Moving Left");
    }

     public void moveRight(){
        System.out.println("Truck is Moving Right");
    }

   public void Service() {
      System.out.println("Truck: Check the Cargo and Brakes.");
   }
   }
