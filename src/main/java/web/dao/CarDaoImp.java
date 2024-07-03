package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 100000));
        carList.add(new Car("Toyota", "Camry", 50000));
        carList.add(new Car("Nissan", "Pathfinder", 75000));
        carList.add(new Car("Lotus", "Eletre", 60000));
        carList.add(new Car("Chery", "Arrizo", 15000));
        return carList;
    }
}
