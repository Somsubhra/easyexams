package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Applicant {

    @Id
    private String id;

    private String uid;

    private String email;

    private String testId;

    private Date createdOn;

    private Date modifiedOn;

    public Applicant() {
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public Applicant(String uid, String email, String testId) {
        this.uid = uid;
        this.email = email;
        this.testId = testId;
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
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
