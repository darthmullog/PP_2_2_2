package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "B745HO", 2012));
        cars.add(new Car("Honda", "E741KX", 2017));
        cars.add(new Car("Ford", "M653TO", 2019));
        cars.add(new Car("Lada", "P856HB", 2017));
        cars.add(new Car("Nissan", "C952OT", 2020));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
