package Year2024.DevDojo.MaratonaJava.Comportamento.teste;

import Year2024.DevDojo.MaratonaJava.Comportamento.dominio.Car;
import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest {

    public static List<Car> cars = List.of(
            new Car("Ferrari","green", 2011),
            new Car("Audi", "black", 1992),
            new Car("Celta","silver",2000)
    );

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars,"black"));
        System.out.println(filterByYearsBefore(cars,2000));

    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(color)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterByYearsBefore(List<Car> cars, int year){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() == year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
