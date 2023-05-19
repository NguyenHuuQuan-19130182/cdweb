package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Account;
import com.shoevn.shoe.Beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
