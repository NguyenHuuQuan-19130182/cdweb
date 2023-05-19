package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "category")

public class Category implements Serializable {
    private static final long serialVersionUID = -2054386655979281969L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_category", length = 20, nullable = false)
    private long id_category;
    @Column(name = "name", length = 255, nullable = false)
    private String name;
    @Column(name = "img", length = 255)
    private String img;
    @Column(name = "parent_id",length = 20, nullable = false)
    private int parent_id;

    public Category() {

    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setId_category(long id_category) {
        this.id_category = id_category;
    }

    public long getId_category() {
        return id_category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", parent_id=" + parent_id +
                '}';
    }
}
