package org.easyexams.core.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Question {

    @Id
    private String id;

    private String text;

    private String categoryId;

    private Integer difficulty;

    private List<Option> options;

    private String answer;

    private Date createdOn;

    private Date modifiedOn;

    public Question() {

    }

    public Question(String text, String categoryId, Integer difficulty, List<Option> options, String answer) {
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
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
