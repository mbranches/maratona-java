package academy.devdojo.maratona.comportamento.test;

import academy.devdojo.maratona.comportamento.domain.Car;
import academy.devdojo.maratona.comportamento.interfaces.CarPredicade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011), new Car("red", 1998)));

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicade ) {
        List<Car> carsFiltered = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicade.test(car)) {
                carsFiltered.add(car);
            }
        }

        return carsFiltered;
    }

    public static void main(String[] args) {
        List<Car> greenCars = filter(
                cars,
                new Predicate<Car>() {
                    @Override
                    public boolean test(Car car) {
                        return car.getColor().toLowerCase().equals("green");
                    }
                }
        );

        List<Car> redCars = filter(
                cars,
                car -> car.getColor().toLowerCase().equals("red")
        );
    }
}
