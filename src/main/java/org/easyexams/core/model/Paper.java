package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Paper {

    @Id
    private String id;

    private String testId;

    private String applicantId;

    private List<Question> questions;

    private Map<String, Stack<Attempt>> attempts;

    private Integer score;

    private Date createdOn;

    private Date modifiedOn;

    public Paper() {

    }

    public Paper(String testId, String applicantId, List<Question> questions, Map<String, Stack<Attempt>> attempts, Integer score) {
        this.testId = testId;
        this.applicantId = applicantId;
        this.questions = questions;
        this.attempts = attempts;
        this.score = score;
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Map<String, Stack<Attempt>> getAttempts() {
        return attempts;
    }

    public void setAttempts(Map<String, Stack<Attempt>> attempts) {
        this.attempts = attempts;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
