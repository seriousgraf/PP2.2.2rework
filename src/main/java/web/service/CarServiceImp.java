package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service

public class CarServiceImp implements CarService {
    private CarDao carDao;

    @Autowired
    public void CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {

        return carDao.getCars(count);
    }
}
