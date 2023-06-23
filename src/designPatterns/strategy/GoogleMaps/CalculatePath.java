package designPatterns.strategy.GoogleMaps;

import designPatterns.strategy.GoogleMaps.PathCalculator.PathCalculatorStrategy;

public class CalculatePath {
    public static void main(String[] args) {
        PathCalculatorStrategy pcs = PathCalculatorFactory.getPathCalculatorStrategy(TransportationMode.WALK);
        pcs.findPath("Point A", "Point B");
    }
}
