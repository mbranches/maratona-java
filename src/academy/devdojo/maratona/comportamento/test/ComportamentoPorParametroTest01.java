package academy.devdojo.maratona.comportamento.test;

import academy.devdojo.maratona.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011), new Car("red", 1998)));

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carFiltered = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().toLowerCase().equals(color.toLowerCase())) {
                carFiltered.add(car);
            }
        }

        return carFiltered;
    }

    private static List<Car> filterGreenCars(List<Car> cars) {
        return filterCarByColor(cars, "Green");
    }

    private static List<Car> filterRedCars(List<Car> cars) {
        return filterCarByColor(cars, "Red");
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> carsFiltered = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() < year) {
                carsFiltered.add(car);
            }
        }

        return carsFiltered;
    }

    public static void main(String[] args) {
        System.out.println(filterGreenCars(cars));
        System.out.println(filterRedCars(cars));

        System.out.println(filterCarByYearBefore(cars, 2020));
    }
}
