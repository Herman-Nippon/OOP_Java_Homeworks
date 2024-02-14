package sem1;

public class BottleOfWater extends Product {
    private int volume;

    public BottleOfWater(String name, int cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + volume +
                '}';
    }
}
