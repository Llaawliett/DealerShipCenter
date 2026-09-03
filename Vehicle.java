public abstract class Vehicle {
  protected String brand;
  protected String model;
  protected double price;

  public Vehicle(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  public abstract String getType();

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return String.format("%s: %s %s - %.2f руб.", getType(), brand, model, price);
  }
}
