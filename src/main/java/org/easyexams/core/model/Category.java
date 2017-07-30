package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Category {

    @Id
    private String id;

    private String name;

    private Date createdOn;

    private Date modifiedOn;

    public Category() {
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public Category(String name) {
        this.name = name;
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
