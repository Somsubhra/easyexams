package org.easyexams.core.exception;

public class QuestionNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Question details not found";
    }
}
