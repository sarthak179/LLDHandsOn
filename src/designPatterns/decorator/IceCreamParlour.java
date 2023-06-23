package designPatterns.decorator;

public class IceCreamParlour {
    public static void main(String[] args) {

        IceCream ic1 = new Sprinkles(new ChocolateScoop(new VanillaScoop(new OrangeCone())));
        System.out.println("Price : "+ic1.getCost());
        System.out.println("Description : "+ic1.getDescription());
    }
}
