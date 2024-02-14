package sem1;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottleOfWater machine = new VendingMachineBottleOfWater();
        machine.addBottle(new BottleOfWater("Water1", 100, 100));
        machine.addBottle(new BottleOfWater("Water2", 10, 50));
        machine.addBottle(new BottleOfWater("Water3", 999, 1000));

        VendingMachineHotDrink machineHotDrink = new VendingMachineHotDrink();
        machineHotDrink.addHotDrink(new HotDrink("Coffee", 100, 250, 80));
        machineHotDrink.addHotDrink(new HotDrink("Tea", 80, 300, 90));
        machineHotDrink.addHotDrink(new HotDrink("Espresso", 50, 100, 80));

        demonstrateFunctionality(machine, machineHotDrink);
    }

    private static void demonstrateFunctionality(VendingMachineBottleOfWater machine, VendingMachineHotDrink machineHotDrink) {
        System.out.println("machine.getProduct(\"Water1\") = " + machine.getProduct("Water1"));
        System.out.println("machineHotDrink.getProduct(\"Coffee\") = " + machineHotDrink.getProduct("Coffee"));
        System.out.println("machineHotDrink.getProduct(\"Tea\", 300, 90) = " + machineHotDrink.getProduct("Tea", 300, 90));
    }
}
