package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProduct(){
        return productDao.findAll();
    }
    public Product getAllProductID(long id){
        return productDao.findProductById(id);
    }
    public List<Product> getListByCategory(long id_category){
        return  productDao.getListByCategory(id_category);
    }
    public List<Product> getLstProductParentId(long parent_id){
        return  productDao.getLstProductParentId(parent_id);
    }
    public long getTotalProduct(long id){
        return productDao.countProductByID(id);
    }
    public long getTotalProductByCategory(long id){
        return productDao.countProductByIdCaregory(id);
    }
    public List<Product> sortProducts(String sortType) {
        if (sortType.equals("name_asc")) {
            return productDao.findAll(Sort.by(Sort.Direction.ASC, "name"));
        } else if (sortType.equals("name_desc")) {
            return productDao.findAll(Sort.by(Sort.Direction.DESC, "name"));
        } else if (sortType.equals("price_asc")) {
            return productDao.findAll(Sort.by(Sort.Direction.ASC, "price"));
        } else if (sortType.equals("price_desc")) {
            return productDao.findAll(Sort.by(Sort.Direction.DESC, "price"));
        } else {
            return productDao.findAll();
        }
    }
    public List<Product> search(String keyword){
        return productDao.search(keyword);
    }

}
