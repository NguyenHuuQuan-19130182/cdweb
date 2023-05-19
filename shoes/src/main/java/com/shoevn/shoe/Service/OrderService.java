package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.Dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;
    public Order save(Order order){
        return orderDao.save(order);
    }
    public Order getOrderById(long id){
        return orderDao.getOrderById(id);
    }
}
