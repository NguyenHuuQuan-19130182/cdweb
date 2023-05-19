package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.Dao.ShippingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    @Autowired
    private ShippingDao shippingDao;

    public ShippingInfo getByIdShipping(long id){
        return shippingDao.getByIdShipping(id);
    }
    public ShippingInfo saveInfo(ShippingInfo shippingInfo){
        return shippingDao.save(shippingInfo);
    }
}
