package com.wordpress.jbaris.deliverableWebApp.bo.impl;

import java.util.Collection;

import com.wordpress.jbaris.deliverableWebApp.bo.CarBO;
import com.wordpress.jbaris.deliverableWebApp.dao.CarDAO;
import com.wordpress.jbaris.deliverableWebApp.entities.Car;


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
