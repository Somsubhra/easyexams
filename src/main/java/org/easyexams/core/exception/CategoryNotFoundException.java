package org.easyexams.core.exception;

public class CategoryNotFoundException extends RuntimeException {

    private String category;

    public CategoryNotFoundException(String category) {
        this.category = category;
    }

    @Override
    public String getMessage() {
        return "Category " + category + " not found";
    }
}
