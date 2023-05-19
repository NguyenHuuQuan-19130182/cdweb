package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.OrderDetail;
import com.shoevn.shoe.Dao.OrderDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailDao detailDao;

    public OrderDetail saveOrderDetail(OrderDetail orderDetail){
        return  detailDao.save(orderDetail);
    }
}
