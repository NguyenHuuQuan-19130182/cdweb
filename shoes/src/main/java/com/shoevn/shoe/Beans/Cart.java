package com.shoevn.shoe.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
    private Product product;
    private int quantity;
    private Size size;

    public  Cart(){}
    public Cart(Product product, int quantity, Size size) {
        this.product = product;
        this.quantity = quantity;
        this.size = size;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "product=" + product +
                ", quantity=" + quantity +
                ", size=" + size +
                '}';
    }
}
