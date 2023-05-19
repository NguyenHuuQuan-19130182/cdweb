package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayymentDao extends JpaRepository<PaymentMethod,Long> {
}
