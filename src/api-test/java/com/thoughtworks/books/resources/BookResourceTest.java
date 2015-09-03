package com.thoughtworks.books.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookResourceTest {

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new BookResource())
            .build();


    @Test
    public void testGetBook() {
        assertThat(resources.client().target("/api/book").request().get(BookRepresentation.class))
                .isEqualTo(new BookRepresentation("Algorithms", "Cormen"));
    }

}