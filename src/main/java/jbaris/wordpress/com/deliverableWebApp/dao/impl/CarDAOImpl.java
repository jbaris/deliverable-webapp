package jbaris.wordpress.com.deliverableWebApp.dao.impl;

import java.util.Collection;

import jbaris.wordpress.com.deliverableWebApp.aux.ProgressMonitor;
import jbaris.wordpress.com.deliverableWebApp.dao.CarDAO;
import jbaris.wordpress.com.deliverableWebApp.entities.Car;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

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
