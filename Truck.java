public class Truck extends Vehicle {
  private final double loadCapacityTons;

  public Truck(String brand, String model, double price, double loadCapacityTons) {
    super(brand, model, price);
    this.loadCapacityTons = loadCapacityTons;
  }

  public double getLoadCapacityTons() {
    return loadCapacityTons;
  }

  @Override
  public String getType() {
    return "Грузовик";
  }
}
