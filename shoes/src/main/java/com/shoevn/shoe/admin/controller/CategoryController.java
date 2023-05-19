package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.admin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/category")
    public String listCategory(ModelMap model){
        List<Category> listCategory = categoryService.listAllCategory();
        if(listCategory !=null && listCategory.size()!=0) {
            model.put("productList", listCategory);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/category";
    }
}
