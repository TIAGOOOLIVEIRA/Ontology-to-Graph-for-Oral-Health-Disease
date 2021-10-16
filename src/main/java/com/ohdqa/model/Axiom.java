package com.ohdqa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
//https://asbnotebook.com/jpa-entity-graph-example-with-spring-boot/
//https://spring.io/guides/gs/accessing-data-neo4j/
//https://protegeproject.github.io/owl2lpg/
//https://spring.io/guides/gs/accessing-neo4j-data-rest/

import lombok.Data;

@Data
@Entity

@NamedEntityGraph
public class Axiom{
    private @Id @GeneratedValue Long id;
    
    private String name;

}