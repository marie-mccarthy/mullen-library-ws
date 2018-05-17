package edu.mullen.library;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;



public class LibraryConfiguration extends Configuration {
	 @Valid
	    @NotNull
	    private DataSourceFactory database = new DataSourceFactory();

	    @JsonProperty("database")
	    public void setDataSourceFactory(DataSourceFactory factory) {
	        this.database = factory;
	    }

	    @JsonProperty("database")
	    public DataSourceFactory getDataSourceFactory() {
	        return database;
	    }
}
