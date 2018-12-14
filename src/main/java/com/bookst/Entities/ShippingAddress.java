package com.bookst.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "shipping_address", schema = "bookstore", catalog = "")
public class ShippingAddress {
    private long id;
    private String shippingAddressCity;
    private String shippingAddressCountry;
    private String shippingAddressName;
    private String shippingAddressState;
    private String shippingAddressStreet1;
    private String shippingAddressStreet2;
    private String shippingAddressZipcode;
    private Collection<UserOrder> userOrdersById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "shipping_address_city", nullable = true, length = 255)
    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    public void setShippingAddressCity(String shippingAddressCity) {
        this.shippingAddressCity = shippingAddressCity;
    }

    @Basic
    @Column(name = "shipping_address_country", nullable = true, length = 255)
    public String getShippingAddressCountry() {
        return shippingAddressCountry;
    }

    public void setShippingAddressCountry(String shippingAddressCountry) {
        this.shippingAddressCountry = shippingAddressCountry;
    }

    @Basic
    @Column(name = "shipping_address_name", nullable = true, length = 255)
    public String getShippingAddressName() {
        return shippingAddressName;
    }

    public void setShippingAddressName(String shippingAddressName) {
        this.shippingAddressName = shippingAddressName;
    }

    @Basic
    @Column(name = "shipping_address_state", nullable = true, length = 255)
    public String getShippingAddressState() {
        return shippingAddressState;
    }

    public void setShippingAddressState(String shippingAddressState) {
        this.shippingAddressState = shippingAddressState;
    }

    @Basic
    @Column(name = "shipping_address_street1", nullable = true, length = 255)
    public String getShippingAddressStreet1() {
        return shippingAddressStreet1;
    }

    public void setShippingAddressStreet1(String shippingAddressStreet1) {
        this.shippingAddressStreet1 = shippingAddressStreet1;
    }

    @Basic
    @Column(name = "shipping_address_street2", nullable = true, length = 255)
    public String getShippingAddressStreet2() {
        return shippingAddressStreet2;
    }

    public void setShippingAddressStreet2(String shippingAddressStreet2) {
        this.shippingAddressStreet2 = shippingAddressStreet2;
    }

    @Basic
    @Column(name = "shipping_address_zipcode", nullable = true, length = 255)
    public String getShippingAddressZipcode() {
        return shippingAddressZipcode;
    }

    public void setShippingAddressZipcode(String shippingAddressZipcode) {
        this.shippingAddressZipcode = shippingAddressZipcode;
    }


    @OneToMany(mappedBy = "shippingAddressByShippingAddressId")
    public Collection<UserOrder> getUserOrdersById() {
        return userOrdersById;
    }

    public void setUserOrdersById(Collection<UserOrder> userOrdersById) {
        this.userOrdersById = userOrdersById;
    }
}
