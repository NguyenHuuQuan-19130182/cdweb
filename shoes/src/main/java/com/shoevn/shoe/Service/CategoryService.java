package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Dao.CategoryDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getAllCategory(){
        return  categoryDao.findAll();
    }
    public Category getCategoryId(int id_category){
        return categoryDao.findCategoryById(id_category);
    }
    public List<Category> findByParentId(int parentId){
        return  categoryDao.findByParentId(parentId);
    }
}
