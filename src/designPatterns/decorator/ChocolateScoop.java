package designPatterns.decorator;

//can only be used as topping not base
public class ChocolateScoop implements IceCream {

    IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 90;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Chocolate Scoop";
    }
}