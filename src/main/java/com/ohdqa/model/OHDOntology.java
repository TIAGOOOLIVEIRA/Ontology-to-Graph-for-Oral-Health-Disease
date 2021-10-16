package com.ohdqa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//import org.neo4j.ogm.annotation.GraphId;
//import org.neo4j.ogm.annotation.NodeEntity;
//import javax.persistence.NamedEntityGraph;
//https://asbnotebook.com/jpa-entity-graph-example-with-spring-boot/
//https://spring.io/guides/gs/accessing-data-neo4j/
//https://protegeproject.github.io/owl2lpg/
//https://github.com/springframeworkguru/spring-boot-neo4j-example/
//https://spring.io/guides/gs/accessing-neo4j-data-rest/


//https://asbnotebook.com/jpa-entity-graph-example-with-spring-boot/

//https://github.com/neo4j-labs/neosemantics
//https://medium.com/neo4j/importing-rdfs-owl-ontologies-into-neo4j-23e4e28ebbad

//https://jmhreif.com/blog/create-data-marvel-sdn/

//Spring.Data for neo4j https://gist.github.com/michael-simons/db0d355446e3487a868602360282762f

import lombok.Data;

@Data
@Entity

//@NamedEntityGraph
public class OHDOntology{
    
    public @Id @GeneratedValue Long id;
    
    public String name;
    public String userName;
    public String description;
    public Date creationDate;
    public Date lastUpdate;
    public String[] comments;
    public String[] filePath;

    public OHDOntology(){}

    public OHDOntology(String name, String userName, String description, Date creationDate, Date lastUpdate, String[] comments, String[] filePath){
        this.name = name;
        this. userName = userName;
        this.description = description;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate; 
        this.comments = comments;
        this.filePath = filePath;
    }
    //upload owl obo
}

//model axiom entity graph