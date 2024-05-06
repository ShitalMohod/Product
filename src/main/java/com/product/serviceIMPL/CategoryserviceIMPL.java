package com.product.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.CategoryDao;
import com.product.entity.Category;
import com.product.service.CategoryService;

@Service
public class CategoryserviceIMPL implements CategoryService {

	@Autowired
	private CategoryDao dao;

	@Override
	public boolean saveCategory(Category category) {
		boolean isAdded = ((CategoryService) dao).saveCategory(category);
		return isAdded;
	}

	@Override
	public Category getCategoryById(long id) {
		return ((CategoryService) dao).getCategoryById(id);
	}

	@Override
	public List<Category> getAllCategory() {
		return ((CategoryService) dao).getAllCategory();
	}

	@Override
	public boolean updateCategory(Category category) {
		return ((CategoryService) dao).updateCategory(category);
	}

	@Override
	public boolean deleteCategory(long categoryId) {
		return ((CategoryService) dao).deleteCategory(categoryId);
	}

}