package Year2024.DevDojo.MaratonaJava.Comportamento.teste;

import Year2024.DevDojo.MaratonaJava.Comportamento.dominio.Car;
import Year2024.DevDojo.MaratonaJava.Comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    public static List<Car> cars = List.of(
            new Car("Ferrari","green", 2011),
            new Car("Audi", "black", 1992),
            new Car("Celta","silver",2000)
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

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}
