package org.easyexams.core.exception;

public class TestNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Test details not found";
    }
}
