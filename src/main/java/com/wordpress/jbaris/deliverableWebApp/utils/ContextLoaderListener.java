package com.wordpress.jbaris.deliverableWebApp.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.web.context.ConfigurableWebApplicationContext;

import com.wordpress.jbaris.deliverableWebApp.aux.ProgressMonitor;

/**
 * @author Juan Ignacio Barisich
 */
public class ContextLoaderListener extends
		org.springframework.web.context.ContextLoaderListener {

	private final ProgressMonitor progressMonitor;

	public ContextLoaderListener(ProgressMonitor progressMonitor) {
		super();
		this.progressMonitor = progressMonitor;
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		progressMonitor.setCurrent("Server initialization completed",
				progressMonitor.getTotal());
	}

	@Override
	protected void customizeContext(ServletContext servletContext,
			ConfigurableWebApplicationContext applicationContext) {
		applicationContext
				.addBeanFactoryPostProcessor(new BeanFactoryPostProcessor() {

					@Override
					public void postProcessBeanFactory(
							ConfigurableListableBeanFactory beanFactory)
							throws BeansException {
						beanFactory.registerSingleton("progressMonitor",
								progressMonitor);

					}
				});
	}
}
