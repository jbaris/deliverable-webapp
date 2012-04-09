package jbaris.wordpress.com.deliverableWebApp.bo;

import java.util.Collection;

import jbaris.wordpress.com.deliverableWebApp.entities.Car;

/**
 * @author Juan Ignacio Barisich
 */
public interface CarBO {

	void addCar(Car car);

	Collection<Car> getAllCars();

}
