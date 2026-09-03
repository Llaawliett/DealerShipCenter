public class Main {
  public static void main(String[] args) {
    DealershipCenter center = new DealershipCenter("АвтоМир");

    center.receiveVehicle(new Car("Toyota", "Camry", 2_500_000, 5));
    center.receiveVehicle(new Car("Lada", "Vesta", 1_200_000, 5));
    center.receiveVehicle(new Car("KAMAZ", "65115", 5_800_000, 15));
    center.receiveVehicle(new Car("Belarus", "MTZ-82", 3_200_000, 82));
    center.receiveVehicle(new Car("Yamaha", "MT-07", 900_000, 689));

    System.out.println();
    center.printAllVehicles();

    System.out.println();
    center.printMostExpensive();
    center.printCheapest();

    System.out.println();
    // sell
    center.sellVehicle("Toyota", "Camry");
    // попытка продать то, чего нет
    center.sellVehicle("Ford", "Focus");

    System.out.println();
    center.printAllVehicles();

    System.out.println();
    center.getMostExpensive();
    center.printCheapest();

    System.out.println();
  }
}
