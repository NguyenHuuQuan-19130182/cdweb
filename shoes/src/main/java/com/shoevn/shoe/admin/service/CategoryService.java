package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.admin.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> listAllCategory(){
        return categoryRepository.findAll();
    }
}
