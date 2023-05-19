package com.shoevn.shoe.Beans;


import jakarta.persistence.*;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id",length = 20,nullable = false)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false, //
            foreignKey = @ForeignKey(name = "Category_PROD_FK"))
    private Category category;
    @Column(name = "name",length = 255,nullable = false)
    private String name;
//    @Column(name = "discount_rate",nullable = false)
//    private double discountRate;
    @Column(name = "price",nullable = false)
    @NumberFormat( style = NumberFormat.Style.CURRENCY)
    private double price;
    @Column(name = "sell_price",nullable = false)
    @NumberFormat( style = NumberFormat.Style.CURRENCY)
    private double sellPrice;
    @Column(name = "img",nullable = false)
    private String img;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_product",nullable = false)
    private Date dateproduct;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "update_product",nullable = false)
//    private Date updateDate;
    @Column(name = "quantity ",nullable = false)
    private Integer quantity;
//    @ManyToOne
//    @JoinColumn(name = "brand_id", nullable = false, //
//            foreignKey = @ForeignKey(name = "brand_PROD_FK"))
//    private Brand brand;
    @OneToMany(mappedBy = "product")
    @Column(name = "Size",nullable = false)
    private List<Size> sizes;
    public Product(){}

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public double getSellPrice() {
        return sellPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Date getDateproduct() {
        return dateproduct;
    }

    public void setDateproduct(Date dateproduct) {
        this.dateproduct = dateproduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sellPrice=" + sellPrice +
                ", img='" + img + '\'' +
                ", dateproduct=" + dateproduct +
                '}';
    }
}
