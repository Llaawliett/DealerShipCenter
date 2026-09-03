public class Motorcycle extends Vehicle {
  private final int engineVolumeCc;

  public Motorcycle(String brand, String model, double price, int engineVolumeCc) {
    super(brand, model, price);
    this.engineVolumeCc = engineVolumeCc;
  }

  public int getEngineVolumeCc() {
    return engineVolumeCc;
  }

  @Override
  public String getType() {
    return "Мотоцикл";
  }
}
