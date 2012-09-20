package com.wordpress.jbaris.deliverableWebApp.dao;

import java.util.Collection;

import com.wordpress.jbaris.deliverableWebApp.entities.Car;


/**
 * @author Juan Ignacio Barisich
 */
public interface CarDAO {

	void addCar(Car car);

	Collection<Car> getAllCars();

}
