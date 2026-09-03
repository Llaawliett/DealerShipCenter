public class Tractor extends Vehicle {
  private final int horsePower;

  public Tractor(String brand, String model, double price, int horsePower) {
    super(brand, model, price);
    this.horsePower = horsePower;
  }

  public int getHorsePower() {
    return horsePower;
  }

  @Override
  public String getType() {
    return "Трактор";
  }
}
