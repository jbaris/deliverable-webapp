package jbaris.wordpress.com.deliverableWebApp.dao;

import java.util.Collection;

import jbaris.wordpress.com.deliverableWebApp.entities.Car;

/**
 * @author Juan Ignacio Barisich
 */
public interface CarDAO {

	void addCar(Car car);

	Collection<Car> getAllCars();

}
