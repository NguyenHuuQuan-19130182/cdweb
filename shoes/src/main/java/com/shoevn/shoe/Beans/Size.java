package com.shoevn.shoe.Beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "size")
public class Size implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "size_id", length = 20, nullable = false)
    private long sizeId;
    @Column(name = "size_num", nullable = false)
    private int size_num;
//    @Column(name = "size_description", nullable = false)
//    private int size_description;
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Product product;

    public Size() {
    }

    public long getSizeId() {
        return sizeId;
    }

    public int getSize_num() {
        return size_num;
    }

    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }

    public void setSize_num(int size_num) {
        this.size_num = size_num;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeId='" + sizeId + '\'' +
                ", size_num=" + size_num +
                '}';
    }
}
