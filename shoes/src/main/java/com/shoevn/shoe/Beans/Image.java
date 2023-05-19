//package com.shoevn.shoe.Beans;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "image")
//public class Image {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "image_id", nullable = false)
//    private Long id;
//    @Column(name = "name",length = 255,nullable = false)
//    private String name;
//    //    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "product_id", nullable = false, //
////            foreignKey = @ForeignKey(name = "IMAGE_PROD_FK"))
////    private Product product;
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    @JsonBackReference
//    private Product product;
//}
