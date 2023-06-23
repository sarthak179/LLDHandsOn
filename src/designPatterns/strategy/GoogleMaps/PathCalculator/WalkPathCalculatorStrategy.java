package designPatterns.strategy.GoogleMaps.PathCalculator;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {

    private static WalkPathCalculatorStrategy walkPathCalculatorStrategy = null;
    private WalkPathCalculatorStrategy() {}
    public static WalkPathCalculatorStrategy getInstance() {
        if (walkPathCalculatorStrategy == null) {
            synchronized (WalkPathCalculatorStrategy.class) {
                if (walkPathCalculatorStrategy == null) {
                    walkPathCalculatorStrategy = new WalkPathCalculatorStrategy();
                }
            }
        }
        return walkPathCalculatorStrategy;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path from "+source+" to "+destination+" for Walk");
    }
}
