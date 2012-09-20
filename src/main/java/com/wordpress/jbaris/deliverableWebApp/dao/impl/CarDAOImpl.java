package com.wordpress.jbaris.deliverableWebApp.dao.impl;

import java.util.Collection;


import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wordpress.jbaris.deliverableWebApp.aux.ProgressMonitor;
import com.wordpress.jbaris.deliverableWebApp.dao.CarDAO;
import com.wordpress.jbaris.deliverableWebApp.entities.Car;

/**
 * @author Juan Ignacio Barisich
 */
public class CarDAOImpl extends HibernateDaoSupport implements CarDAO {

	private ProgressMonitor progressMonitor;

	@Override
	public void addCar(Car car) {
		getHibernateTemplate().saveOrUpdate(car);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Car> getAllCars() {
		return getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(Car.class));
	}

	public ProgressMonitor getProgressMonitor() {
		return progressMonitor;
	}

	@Override
	protected void initDao() throws Exception {
		// Simulates a long startup
		for (int i = 20; i < 90; i++) {
			Thread.sleep(50);
			getProgressMonitor().setCurrent("Init db...", i);
		}
	}

	public void setProgressMonitor(ProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

}
