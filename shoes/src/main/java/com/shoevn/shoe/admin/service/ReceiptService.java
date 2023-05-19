package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.admin.repository.OrderDetailRepository;
import com.shoevn.shoe.admin.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptService {
    @Autowired
    private ReceiptRepository receiptRepository;

    @Autowired
    private OrderDetailRepository receiptDetailRepository;

    public List<Order> getAllReceipt(){
        return receiptRepository.findAll();
    }
}
