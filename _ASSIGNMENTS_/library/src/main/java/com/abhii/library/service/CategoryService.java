package com.abhii.library.service;


import com.abhii.library.entity.Category;
import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Long id);
}