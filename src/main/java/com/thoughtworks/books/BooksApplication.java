package com.thoughtworks.books;

import com.thoughtworks.books.resources.BookResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class BooksApplication extends Application<BooksConfiguration>{

    @Override
    public void run(BooksConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(BookResource.class);
    }
}
