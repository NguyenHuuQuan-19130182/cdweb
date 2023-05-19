package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "shipping")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_id")
    private Long id;
    @Column(name = "shipping_email", length = 128, nullable = false)
    private String shippingEmail;
    @Column(name = "shipping_name", length = 255, nullable = false)
    private String shippingName;
    @Column(name = "shipping_phone", length = 128, nullable = false)
    private String shippingPhone;
    @Column(name = "shipping_address", length = 255, nullable = false)
    private String shippingAddress;
    @Column(name = "xa", length = 255, nullable = false)
    private String xa;
    @Column(name = "huyen", length = 255, nullable = false)
    private String huyen;
    @Column(name = "tinh", length = 255, nullable = false)
    private String tinh;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_ship", nullable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_ship", nullable = false)
    private Date updateDate;

    public ShippingInfo() {

    }

    public ShippingInfo(Long id, String shippingEmail, String shippingName, String shippingPhone, String shippingAddress, String xa, String huyen, String tinh, Date createDate, Date updateDate) {
        this.id = id;
        this.shippingEmail = shippingEmail;
        this.shippingName = shippingName;
        this.shippingPhone = shippingPhone;
        this.shippingAddress = shippingAddress;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShippingEmail() {
        return shippingEmail;
    }

    public void setShippingEmail(String shippingEmail) {
        this.shippingEmail = shippingEmail;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    @Override
    public String toString() {
        return "ShippingInfo{" +
                "id=" + id +
                ", shippingEmail='" + shippingEmail + '\'' +
                ", shippingName='" + shippingName + '\'' +
                ", shippingPhone='" + shippingPhone + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", xa='" + xa + '\'' +
                ", huyen='" + huyen + '\'' +
                ", tinh='" + tinh + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}