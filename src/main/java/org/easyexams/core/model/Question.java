package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Question {

    @Id
    private String id;

    private String text;

    private String categoryId;

    private Integer difficulty;

    private Map<String, Option> options;

    private String answer;

    private Date createdOn;

    private Date modifiedOn;

    public Question() {
        this.createdOn = new Date();
        this.modifiedOn = new Date();
        this.options = new HashMap<>();
    }

    public Question(String text, String categoryId, Integer difficulty) {
        this.text = text;
        this.categoryId = categoryId;
        this.difficulty = difficulty;
        this.options = new HashMap<>();
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public Question(String text, String categoryId, Integer difficulty, Map<String, Option> options, String answer) {
        this.text = text;
        this.categoryId = categoryId;
        this.difficulty = difficulty;
        this.options = options;
        this.answer = answer;
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Map<String, Option> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Option> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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
