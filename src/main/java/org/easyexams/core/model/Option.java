package org.easyexams.core.model;

import java.util.Date;
import java.util.UUID;

public class Option {

    private String id;

    private String text;

    private Date createdOn;

    private Date modifiedOn;

    public Option() {

    }

    public Option(String text) {
        this.id = UUID.randomUUID().toString();
        this.text = text;
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
