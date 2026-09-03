public class Car extends Vehicle {
  private final int seats;

  public Car(String brand, String model, double price, int seats) {
    super(brand, model, price);
    this.seats = seats;
  }

  public int getSeats() {
    return seats;
  }

  @Override
  public String getType() {
    return "Легковой автомобиль";
  }
}
