package edu.mullen.library;

import org.skife.jdbi.v2.DBI;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


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

		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");



		BooksResource booksResource = new BooksResource(jdbi.onDemand(BookDAO.class)); 
		environment.jersey().register(booksResource);

		// nothing to do yet
	}
    
    
}