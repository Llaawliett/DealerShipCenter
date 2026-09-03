import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DealershipCenter {
  private final String name;
  private final List<Vehicle> stock = new ArrayList<>();

  public DealershipCenter(String name) {
    this.name = name;
  }

  public void receiveVehicle(Vehicle vehicle) {
    stock.add(vehicle);
    System.out.printf("Принято на склад: %s%n", vehicle);
  }

  public void sellVehicle(String brand, String model) {
    Optional<Vehicle> found = stock.stream()
        .filter(v -> v.getBrand().equalsIgnoreCase(brand) && v.getModel().equalsIgnoreCase(model)).findFirst();
    if (found.isPresent()) {
      Vehicle sold = found.get();
      stock.remove(sold);
      System.out.printf("Продан автомобиль: %s%n", sold);
    } else {
      System.out.printf("К сожалению, автомобиль \"%s %s\" отсутствует в наличии%n", brand, model);
    }
  }

  public void printAllVehicles() {
    if (stock.isEmpty()) {
      System.out.println("На складе нет автомобилей");
      return;
    }
    System.out.printf("Автомобили в наличии в \"%s\": %n", name);
    for (Vehicle v : stock) {
      System.out.println(" " + v);
    }
  }

  public Vehicle getMostExpensive() {
    return stock.stream().max((a, b) -> Double.compare(a.getPrice(), b.getPrice())).orElse(null);
  }

  public Vehicle getCheapest() {
    return stock.stream().min((a, b) -> Double.compare(a.getPrice(), b.getPrice())).orElse(null);
  }

  public void printMostExpensive() {
    Vehicle mostExpensive = getMostExpensive();
    if (mostExpensive == null) {
      System.out.println("На складе нет автомобтлей.");
    } else {
      System.out.println("Самый дорогой автомобиль: " + mostExpensive);
    }
  }

  public void printCheapest() {
    Vehicle cheapest = getCheapest();
    if (cheapest == null) {
      System.out.println("На складе нет автомобилей");
    } else {
      System.out.println("Самый дешевый автомобиль: " + cheapest);
    }
  }
}
