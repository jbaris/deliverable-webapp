package com.wordpress.jbaris.deliverableWebApp.server;


import org.mortbay.jetty.webapp.WebAppContext;
import org.mortbay.resource.Resource;

import com.wordpress.jbaris.deliverableWebApp.aux.ProgressMonitor;
import com.wordpress.jbaris.deliverableWebApp.utils.ContextLoaderListener;

/**
 * @author Juan Ignacio Barisich
 */
public class Server {

	private static Server instance;

	public static Server getInstance() {
		if (instance == null) {
			instance = new Server();
		}
		return instance;
	}

	private org.mortbay.jetty.Server server;

	private Server() {

	}

	public void start(Integer port, ProgressMonitor progressMonitor) {
		try {
			server = new org.mortbay.jetty.Server(port);
			final WebAppContext context = new WebAppContext();
			context.addEventListener(new ContextLoaderListener(progressMonitor));
			context.setDescriptor("/WEB-INF/web.xml");
			context.setBaseResource(Resource.newResource(ClassLoader
					.getSystemResource("webapp")));
			context.setContextPath("/");
			context.setParentLoaderPriority(true);
			server.setHandler(context);
			System.setProperty("ehcache.disk.store.dir", "db/cache");
			server.start();
		} catch (final Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public void stop() {
		try {
			if (server != null) {
				server.stop();
				server = null;
			}
		} catch (final Exception e) {
			throw new IllegalStateException(e);
		}
	}
}
