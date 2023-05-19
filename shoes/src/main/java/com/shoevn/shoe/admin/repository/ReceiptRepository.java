package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends JpaRepository<Order,Long> {
}
