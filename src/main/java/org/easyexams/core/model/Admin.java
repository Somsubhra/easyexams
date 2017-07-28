package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Admin {

    @Id
    private String id;

    private String username;

    private String password;

    private Date createdOn;

    private Date modifiedOn;

    public Admin() {

    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
