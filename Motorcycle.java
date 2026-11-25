public class Motorcycle extends Vehicle implements {
private String EngineType;

   public Motorcycle(String brand, String model, int year, String engineType){
       super(brand, model, year);
       this.EngineType = engineType;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Engine Type: " + EngineType);
      }


     public void moveForward(){
        System.out.println("Motorcycle is Moving Forward");
    }

     public void moveBackward(){
        System.out.println("Motorcycle is Moving Backward");
    }

     public void moveLeft(){
        System.out.println("Motorcycle is Moving Left");
    }

     public void moveRight(){
        System.out.println("Motorcycle is Moving Right");
    }
    public void Service() {
        System.out.println("Motorcycle: Inspect the chain and check the Brakes.");
    }
    }
