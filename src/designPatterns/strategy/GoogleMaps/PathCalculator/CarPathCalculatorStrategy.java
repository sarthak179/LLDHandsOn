package designPatterns.strategy.GoogleMaps.PathCalculator;

import designPatterns.strategy.GoogleMaps.CalculatePath;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {

    private static CarPathCalculatorStrategy carPathCalculatorStrategy = null;
    private CarPathCalculatorStrategy() {}
    public static CarPathCalculatorStrategy getInstance() {
        if(carPathCalculatorStrategy == null) {
            synchronized (CarPathCalculatorStrategy.class) {
                if(carPathCalculatorStrategy == null) {
                    carPathCalculatorStrategy = new CarPathCalculatorStrategy();
                }
            }
        }
        return carPathCalculatorStrategy;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path from "+source+" to "+destination+" for Car");
    }
}