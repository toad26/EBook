package com.bookst.Entities;

import javax.persistence.*;


@Entity
@Table(name = "user_billing", schema = "bookstore", catalog = "")
public class UserBilling {
    private long id;
    private String userBillingCity;
    private String userBillingCountry;
    private String userBillingName;
    private String userBillingState;
    private String userBillingStreet1;
    private String userBillingStreet2;
    private String userBillingZipcode;
    private Long userPaymentId;
    private UserPayment userPaymentByUserPaymentId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_billing_city", nullable = true, length = 255)
    public String getUserBillingCity() {
        return userBillingCity;
    }

    public void setUserBillingCity(String userBillingCity) {
        this.userBillingCity = userBillingCity;
    }

    @Basic
    @Column(name = "user_billing_country", nullable = true, length = 255)
    public String getUserBillingCountry() {
        return userBillingCountry;
    }

    public void setUserBillingCountry(String userBillingCountry) {
        this.userBillingCountry = userBillingCountry;
    }

    @Basic
    @Column(name = "user_billing_name", nullable = true, length = 255)
    public String getUserBillingName() {
        return userBillingName;
    }

    public void setUserBillingName(String userBillingName) {
        this.userBillingName = userBillingName;
    }

    @Basic
    @Column(name = "user_billing_state", nullable = true, length = 255)
    public String getUserBillingState() {
        return userBillingState;
    }

    public void setUserBillingState(String userBillingState) {
        this.userBillingState = userBillingState;
    }

    @Basic
    @Column(name = "user_billing_street1", nullable = true, length = 255)
    public String getUserBillingStreet1() {
        return userBillingStreet1;
    }

    public void setUserBillingStreet1(String userBillingStreet1) {
        this.userBillingStreet1 = userBillingStreet1;
    }

    @Basic
    @Column(name = "user_billing_street2", nullable = true, length = 255)
    public String getUserBillingStreet2() {
        return userBillingStreet2;
    }

    public void setUserBillingStreet2(String userBillingStreet2) {
        this.userBillingStreet2 = userBillingStreet2;
    }

    @Basic
    @Column(name = "user_billing_zipcode", nullable = true, length = 255)
    public String getUserBillingZipcode() {
        return userBillingZipcode;
    }

    public void setUserBillingZipcode(String userBillingZipcode) {
        this.userBillingZipcode = userBillingZipcode;
    }

    @Basic
    @Column(name = "user_payment_id", nullable = true)
    public Long getUserPaymentId() {
        return userPaymentId;
    }

    public void setUserPaymentId(Long userPaymentId) {
        this.userPaymentId = userPaymentId;
    }

     @ManyToOne
    @JoinColumn(name = "user_payment_id", referencedColumnName = "id")
    public UserPayment getUserPaymentByUserPaymentId() {
        return userPaymentByUserPaymentId;
    }

    public void setUserPaymentByUserPaymentId(UserPayment userPaymentByUserPaymentId) {
        this.userPaymentByUserPaymentId = userPaymentByUserPaymentId;
    }
}
