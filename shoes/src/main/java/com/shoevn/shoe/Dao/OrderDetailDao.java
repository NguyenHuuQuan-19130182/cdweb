package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailDao extends JpaRepository<OrderDetail,Long> {
    @Query("select o from OrderDetail o where o.id = ?1")
    public List<OrderDetail> getAllById(long id);
}
