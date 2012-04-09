package jbaris.wordpress.com.deliverableWebApp.aux;

/**
 * @author Juan Ignacio Barisich
 */
public interface ProgressMonitor {

	int getTotal();

	void setCurrent(String status, int current);

	void start(String status);

}
