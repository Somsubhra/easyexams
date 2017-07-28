package org.easyexams.core.model;

import java.util.Date;

public class Option {

    private String text;

    private Date createdOn;

    private Date modifiedOn;

    public Option() {

    }

    public Option(String text) {
        this.text = text;
        this.createdOn = new Date();
        this.modifiedOn = new Date();
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
