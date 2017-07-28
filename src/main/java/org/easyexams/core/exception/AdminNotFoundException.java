package org.easyexams.core.exception;

public class AdminNotFoundException extends RuntimeException {

    private String username;

    public AdminNotFoundException(String username) {
        this.username = username;
    }

    @Override
    public String getMessage() {
        return "Admin " + username + " not found";
    }
}
