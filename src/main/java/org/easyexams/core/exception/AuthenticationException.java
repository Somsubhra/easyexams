package org.easyexams.core.exception;

public class AuthenticationException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Incorrect username and password combination";
    }
}
