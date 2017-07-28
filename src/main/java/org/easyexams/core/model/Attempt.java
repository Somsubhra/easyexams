package org.easyexams.core.model;

import java.util.Date;

public class Attempt {

    private String answer;

    private Date attemptTime;

    public Attempt() {

    }

    public Attempt(String answer, Date attemptTime) {
        this.answer = answer;
        this.attemptTime = attemptTime;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAttemptTime() {
        return attemptTime;
    }

    public void setAttemptTime(Date attemptTime) {
        this.attemptTime = attemptTime;
    }
}
