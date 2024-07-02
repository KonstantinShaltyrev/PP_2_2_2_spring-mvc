package web.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope("singleton")
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(List<Car> cars, int numbers) {
        return cars.stream().limit(numbers).collect(Collectors.toList());
    }
}
