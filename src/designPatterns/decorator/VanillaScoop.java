package designPatterns.decorator;

//can only be used as topping not base
public class VanillaScoop implements IceCream {

    IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Vanilla Scoop";
    }
}
