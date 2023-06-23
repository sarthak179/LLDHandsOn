package designPatterns.strategy.GoogleMaps;

import designPatterns.strategy.GoogleMaps.PathCalculator.BikePathCalculatorStrategy;
import designPatterns.strategy.GoogleMaps.PathCalculator.CarPathCalculatorStrategy;
import designPatterns.strategy.GoogleMaps.PathCalculator.PathCalculatorStrategy;
import designPatterns.strategy.GoogleMaps.PathCalculator.WalkPathCalculatorStrategy;

import java.nio.file.Path;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategy (TransportationMode transportationMode) {
        switch (transportationMode) {
            case CAR -> {
                return CarPathCalculatorStrategy.getInstance();
            }
            case BIKE -> {
                return new BikePathCalculatorStrategy();
            }
            case WALK -> {
                return WalkPathCalculatorStrategy.getInstance();
            }
            default -> {
                return null;
            }
        }
    }
}
