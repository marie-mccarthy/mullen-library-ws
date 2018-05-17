package edu.mullen.library;

import org.eclipse.jetty.servlets.CrossOriginFilter;
import org.skife.jdbi.v2.DBI;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;


public class LibraryApplication extends Application<LibraryConfiguration> {
	public static void main(String[] args) throws Exception {
		new LibraryApplication().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<LibraryConfiguration> bootstrap) {
		// nothing to do yet
	}

	@Override
	public void run(LibraryConfiguration configuration,
			Environment environment) {

		final FilterRegistration.Dynamic cors =
				environment.servlets().addFilter("CORS", CrossOriginFilter.class);

		// Configure CORS parameters
		cors.setInitParameter("allowedOrigins", "*");
		cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
		cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

		// Add URL mapping
		cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");

		BooksResource booksResource = new BooksResource(jdbi.onDemand(BookDAO.class)); 
		environment.jersey().register(booksResource);

		// nothing to do yet
	}
    
    
}