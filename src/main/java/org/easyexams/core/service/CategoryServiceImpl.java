package org.easyexams.core.service;

import org.easyexams.core.exception.CategoryExistsException;
import org.easyexams.core.exception.CategoryNotFoundException;
import org.easyexams.core.model.Category;
import org.easyexams.core.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(String name) {
        if(!categoryRepository.countByName(name).equals(0)) {
            throw new CategoryExistsException(name);
        }

        Category category = new Category(name);
        category = categoryRepository.save(category);

        return category;
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void delete(String name) {
        Category category = categoryRepository.findByName(name);

        if(category == null) {
            throw new CategoryNotFoundException(name);
        }

        categoryRepository.delete(category);
    }
}
