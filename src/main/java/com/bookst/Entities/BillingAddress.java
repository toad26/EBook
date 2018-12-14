package com.bookst.Entities;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "billing_address", schema = "bookstore", catalog = "")
public class BillingAddress {
    private long id;
    private String billingAddressCity;
    private String billingAddressCountry;
    private String billingAddressName;
    private String billingAddressState;
    private String billingAddressStreet1;
    private String billingAddressStreet2;
    private String billingAddressZipcode;
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
    @Column(name = "billing_address_city", nullable = true, length = 255)
    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    public void setBillingAddressCity(String billingAddressCity) {
        this.billingAddressCity = billingAddressCity;
    }

    @Basic
    @Column(name = "billing_address_country", nullable = true, length = 255)
    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    public void setBillingAddressCountry(String billingAddressCountry) {
        this.billingAddressCountry = billingAddressCountry;
    }

    @Basic
    @Column(name = "billing_address_name", nullable = true, length = 255)
    public String getBillingAddressName() {
        return billingAddressName;
    }

    public void setBillingAddressName(String billingAddressName) {
        this.billingAddressName = billingAddressName;
    }

    @Basic
    @Column(name = "billing_address_state", nullable = true, length = 255)
    public String getBillingAddressState() {
        return billingAddressState;
    }

    public void setBillingAddressState(String billingAddressState) {
        this.billingAddressState = billingAddressState;
    }

    @Basic
    @Column(name = "billing_address_street1", nullable = true, length = 255)
    public String getBillingAddressStreet1() {
        return billingAddressStreet1;
    }

    public void setBillingAddressStreet1(String billingAddressStreet1) {
        this.billingAddressStreet1 = billingAddressStreet1;
    }

    @Basic
    @Column(name = "billing_address_street2", nullable = true, length = 255)
    public String getBillingAddressStreet2() {
        return billingAddressStreet2;
    }

    public void setBillingAddressStreet2(String billingAddressStreet2) {
        this.billingAddressStreet2 = billingAddressStreet2;
    }

    @Basic
    @Column(name = "billing_address_zipcode", nullable = true, length = 255)
    public String getBillingAddressZipcode() {
        return billingAddressZipcode;
    }

    public void setBillingAddressZipcode(String billingAddressZipcode) {
        this.billingAddressZipcode = billingAddressZipcode;
    }


    @OneToMany(mappedBy = "billingAddressByBillingAddressId")
    public Collection<UserOrder> getUserOrdersById() {
        return userOrdersById;
    }

    public void setUserOrdersById(Collection<UserOrder> userOrdersById) {
        this.userOrdersById = userOrdersById;
    }
}
