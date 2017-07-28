package org.easyexams.core.service;

import org.easyexams.core.model.Category;

import java.util.List;

public interface CategoryService {

    Category create(String name);

    List<Category> getCategories();

    void delete(String name);
}
