package com.ohdqa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoLoader implements CommandLineRunner {
    @Autowired
    private final OHDOntologyRepository repo;

    @Autowired
    public DemoLoader(OHDOntologyRepository repo){
        this.repo = repo;
    }

    @Override
    public void run(String... strings) {
        
        this.repo.save(new OHDOntology("Tiago", "tiagoooliveira", "Ontology foda", new Date(), new Date(), new String[]{"lets get started"}, new String[]{"blob/asd/asd.obo"}));
    }
}

//https://www.linkedin.com/learning/spring-spring-data-2/spring-data-rest
//https://www.baeldung.com/spring-boot-data-sql-and-schema-sql
//https://www.byteperceptions.com/spring-boot/creating-an-environment-specific-data-loader-for-spring-boot.html