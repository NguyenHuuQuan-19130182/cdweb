package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {
}
