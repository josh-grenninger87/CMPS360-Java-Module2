package inheritance;

public class vehicle {
    protected String brand = "Toyota";
    public void honk() {
        System.out.println("Beep..Beep");
    }
}

class Truck extends vehicle {
  private String modelName = "Tundra";
  public static void main(String[] args){
    Truck newTruck = new Truck();
    newTruck.honk();
    System.out.println(newTruck.brand + " " + newTruck.modelName);
  }
}


