package org.easyexams.core.exception;

public class AdminExistsException extends RuntimeException {

    private String username;

    public AdminExistsException(String username) {
        this.username = username;
    }

    @Override
    public String getMessage() {
        return "Admin with username " + username + " already exists";
    }
}
