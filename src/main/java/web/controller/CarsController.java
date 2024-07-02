package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5", required = false) int count, ModelMap model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 100000));
        carList.add(new Car("Toyota", "Camry", 50000));
        carList.add(new Car("Nissan", "Pathfinder", 75000));
        carList.add(new Car("Lotus", "Eletre", 60000));
        carList.add(new Car("Chery", "Arrizo", 15000));
        carList = (count >= 0) ? carService.getCars(carList, count) : carService.getCars(carList, 5);
        model.addAttribute("carList", carList);
        return "car";
    }
}
