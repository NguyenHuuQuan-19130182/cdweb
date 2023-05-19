package com.shoevn.shoe.Service;

import com.shoevn.shoe.Dao.PayymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {
    @Autowired
    private PayymentDao payymentDao;


}
