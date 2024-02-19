package sem2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human person1 = new Human("Herman");
        Human person2 = new Human("John");
        market.acceptToMarket(person1);
        market.acceptToMarket(person2);
        market.update();
    }
}
