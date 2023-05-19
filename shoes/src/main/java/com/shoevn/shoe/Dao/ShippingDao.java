package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingDao extends JpaRepository<ShippingInfo,Long> {
    @Query("select  s from ShippingInfo s where s.id = ?1")
    public ShippingInfo getByIdShipping(long id);
}
