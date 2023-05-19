package com.shoevn.shoe.Controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.Service.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.sql.Timestamp;
import java.util.*;

@Controller
public class CheckoutController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private ShippingService shippingService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/checkout")
    public String viewCheckout(ModelMap modelMap, HttpSession session, @ModelAttribute("shippingInfo") ShippingInfo shippingInfo) {
        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        shippingInfo.setCreateDate(new Timestamp(new Date().getTime()));
        shippingInfo.setUpdateDate(new Timestamp(new Date().getTime()));
        shippingService.saveInfo(shippingInfo);
        ShippingInfo idShippingInfo = shippingService.getByIdShipping(shippingInfo.getId());
        Order order = new Order();
        order.setShippingInfo(idShippingInfo);
        order.setOrderDate(new Timestamp(new Date().getTime()));
        orderService.save(order);
        for (Map.Entry<Long, Cart> entry : cartItems.entrySet()) {
            Order order1 = orderService.getOrderById(order.getId());
//            Product product = productService.getAllProductID(entry.getValue().getProduct().getId());
            OrderDetail detail = new OrderDetail();
            detail.setOrder(order1);
            detail.setProduct(entry.getValue().getProduct());
//            detail.setProduct(product);
            detail.setPrice(entry.getValue().getProduct().getPrice());
            detail.setQuanity(entry.getValue().getQuantity());
            detail.setSize(entry.getValue().getSize());
            detail.setOrderDatedetail(new Timestamp(new Date().getTime()));
            orderDetailService.saveOrderDetail(detail);
        }
        cartItems = new HashMap<>();
        session.setAttribute("myCartItems", cartItems);
        return "index";
    }
//    public String viewCheckout(ModelMap mm, HttpSession session, @ModelAttribute("receipt") Receipt receipt) {
//        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
//        if (cartItems == null) {
//            cartItems = new HashMap<>();
//        }
//        receipt.setReceiptDate(new Timestamp(new Date().getTime()));
//        receipt.setReceiptStatus(true);
//        receiptService.create(receipt);
//        for (Map.Entry<Long, Cart> entry : cartItems.entrySet()) {
//            ReceiptItem receiptItem = new ReceiptItem();
//            receiptItem.setReceipt(receipt);
//            receiptItem.setProduct(entry.getValue().getProduct());
//            receiptItem.setReceiptItemPrice(entry.getValue().getProduct().getProductPrice());
//            receiptItem.setReceiptItemSale(entry.getValue().getProduct().getProductSale());
//            receiptItem.setReceiptItemQuantity(entry.getValue().getQuantity());
//            receiptItem.setReceiptItemStatus(true);
//            receiptItemService.create(receiptItem);
//        }
//        cartItems = new HashMap<>();
//        session.setAttribute("myCartItems", cartItems);
//        session.setAttribute("myCartTotal", 0);
//        session.setAttribute("myCartNum", 0);
//        return "pages/success";
//    }
}
