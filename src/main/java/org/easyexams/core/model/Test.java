package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.*;

public class Test {

    @Id
    private String id;

    private String name;

    private Map<String, Double> weightage;

    private List<String> questionIds;

    private Date startTime;

    private Long duration;

    private Boolean visible;

    private Date createdOn;

    private Date modifiedOn;

    public Test() {
        this.weightage = new HashMap<>();
        this.questionIds = new ArrayList<>();
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public Test(String name, Map<String, Double> weightage, List<String> questionIds, Date startTime, Long duration) {
        this.name = name;
        this.weightage = weightage;
        this.questionIds = questionIds;
        this.startTime = startTime;
        this.duration = duration;
        this.visible = false;
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

    public Map<String, Double> getWeightage() {
        return weightage;
    }

    public void setWeightage(Map<String, Double> weightage) {
        this.weightage = weightage;
    }

    public List<String> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(List<String> questionIds) {
        this.questionIds = questionIds;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
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
