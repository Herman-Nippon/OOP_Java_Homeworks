package sem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {
    private List<BottleOfWater> bottleList;

    public VendingMachineBottleOfWater() {
        this.bottleList = new ArrayList<>();
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : bottleList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public void addBottle(BottleOfWater bottle) {
        this.bottleList.add(bottle);
    }
}
