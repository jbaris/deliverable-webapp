package com.wordpress.jbaris.deliverableWebApp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.wordpress.jbaris.deliverableWebApp.bo.CarBO;
import com.wordpress.jbaris.deliverableWebApp.entities.Car;

/**
 * @author Juan Ignacio Barisich
 */
public class AddCarController extends AbstractController {

	private CarBO carBO;

	public CarBO getCarBO() {
		return carBO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		final Car car = new Car();
		car.setName(request.getParameter("name"));
		getCarBO().addCar(car);
		final Map<String, Object> model = new HashMap<String, Object>();
		model.put("cars", getCarBO().getAllCars());
		return new ModelAndView("admin", model);
	}

	public void setCarBO(CarBO carBO) {
		this.carBO = carBO;
	}

}
