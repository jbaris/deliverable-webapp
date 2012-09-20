package com.wordpress.jbaris.deliverableWebApp.bo;

import java.util.Collection;

import com.wordpress.jbaris.deliverableWebApp.entities.Car;


/**
 * @author Juan Ignacio Barisich
 */
public interface CarBO {

	void addCar(Car car);

	Collection<Car> getAllCars();

}
