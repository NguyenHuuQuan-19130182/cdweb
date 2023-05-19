package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.admin.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ReceiptController {
    @Autowired
    private ReceiptService receiptService;
    @GetMapping("/receipt")
    public String listReceipt(ModelMap model){
        List<Order> listReceipt = receiptService.getAllReceipt();
        if(listReceipt !=null && listReceipt.size()!=0) {
            model.put("productList", listReceipt);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/receipt";
    }
}
