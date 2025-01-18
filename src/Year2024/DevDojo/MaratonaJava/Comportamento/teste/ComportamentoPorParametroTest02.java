package Year2024.DevDojo.MaratonaJava.Comportamento.teste;

import Year2024.DevDojo.MaratonaJava.Comportamento.dominio.Car;
import Year2024.DevDojo.MaratonaJava.Comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    public static List<Car> cars = List.of(
            new Car("Ferrari", "green", 2011),
            new Car("Audi", "black", 1992),
            new Car("Celta", "silver", 2000)
    );

    public static void main(String[] args) {

//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black"));
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> yearCars = filter(cars, car -> car.getYear() == 2000);

        System.out.println(greenCars);
        System.out.println(blackCars);
        System.out.println(yearCars);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));

    }


    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtredList.add(e);
            }
        }
        return filtredList;
    }

}

