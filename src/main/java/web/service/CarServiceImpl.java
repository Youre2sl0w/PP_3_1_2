package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Mercedes Benz", "W196", 1954));
            carList.add(new Car("Ferrari", "250 GTO", 1962));
            carList.add(new Car("Bugatti", "Royale Kellner Coupe", 1932));
            carList.add(new Car("Aston Martin", "DB4GT", 1962));
            carList.add(new Car("Shelby", "260 Cobra", 1962));
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}