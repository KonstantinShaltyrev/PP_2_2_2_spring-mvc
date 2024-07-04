package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImp (CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> filterCars(int numbers) {
        int num = (numbers < 0) ? 5 : numbers;
        return carDao.getCars().stream().limit(num).collect(Collectors.toList());
    }
}
