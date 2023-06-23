package designPatterns.decorator;

//can only be used as base not topping
public class OrangeCone implements IceCream {
    public OrangeCone() {}
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return " Orange Cone";
    }
}
