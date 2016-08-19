package edu.uchicago.jagoldman.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jahnaariellegoldman on 8/15/16.
 */
@Entity
public class Type {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Type(String name) {
        this.name = name;
    }

    public Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
