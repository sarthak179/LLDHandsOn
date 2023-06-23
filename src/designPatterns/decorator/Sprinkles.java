package designPatterns.decorator;

public class Sprinkles implements IceCream {

    IceCream iceCream;
    public Sprinkles(IceCream iceCream) {
         this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " Sprinkles";
    }
}
