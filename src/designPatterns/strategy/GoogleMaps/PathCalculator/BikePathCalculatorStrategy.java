package designPatterns.strategy.GoogleMaps.PathCalculator;

import designPatterns.strategy.GoogleMaps.PathCalculatorFactory;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path from "+source+" to "+destination+" for Bike");
    }
}
