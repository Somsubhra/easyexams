package org.easyexams.core.exception;

public class TestExistsException extends RuntimeException {

    private String name;

    public TestExistsException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Test " + name + " already exists";
    }
}
