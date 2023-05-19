package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order,Long> {
    @Query("select  o from Order o where o.id = ?1")
    public Order getOrderById(long id);
}
