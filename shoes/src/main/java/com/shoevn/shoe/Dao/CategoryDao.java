package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
    @Query("select u from Category  u where  u.id_category =?1")
    public Category findCategoryById(long id_category);
    @Query("select u from Category  u where  u.parent_id =?1")
    public List<Category> findByParentId(int parentId);
}
