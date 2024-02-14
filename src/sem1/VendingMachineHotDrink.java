package sem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink implements VendingMachine {
    private List<HotDrink> hotDrinkList;

    public VendingMachineHotDrink() {
        this.hotDrinkList = new ArrayList<>();
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinkList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name) &&
                    hotDrink.getTemperature() == temperature &&
                    hotDrink.getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;
    }
    
    public void addHotDrink(HotDrink hotDrink) {
        hotDrinkList.add(hotDrink);
    }
}
