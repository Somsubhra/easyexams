package org.easyexams.core.exception;

public class CategoryExistsException extends RuntimeException {

    private String category;

    public CategoryExistsException(String category) {
        this.category = category;
    }

    @Override
    public String getMessage() {
        return "Category " + category + " already exists";
    }
}
