package jbaris.wordpress.com.deliverableWebApp.bo.impl;

import java.util.Collection;

import jbaris.wordpress.com.deliverableWebApp.bo.CarBO;
import jbaris.wordpress.com.deliverableWebApp.dao.CarDAO;
import jbaris.wordpress.com.deliverableWebApp.entities.Car;

/**
 * @author Juan Ignacio Barisich
 */
public class CarBOImpl implements CarBO {

	private CarDAO carDAO;

	@Override
	public void addCar(Car car) {
		getCarDAO().addCar(car);
	}

	@Override
	public Collection<Car> getAllCars() {
		return getCarDAO().getAllCars();
	}

	public CarDAO getCarDAO() {
		return carDAO;
	}

	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

}
