package academy.devdojo.maratona.comportamento.test;

import academy.devdojo.maratona.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011), new Car("red", 1998)));

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
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

        List<Integer> nums = List.of(1, 2, 3, 7, 4, 9, 6, 0, 8);
        List<Integer> evenNums = filter(
                nums,
                num -> num % 2 == 0
        );

        System.out.println(evenNums);
    }
}
