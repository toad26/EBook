package com.bookst.Entities;

import javax.persistence.*;


@Entity
@Table(name = "user_shipping", schema = "bookstore", catalog = "")
public class UserShipping {
    private long id;
    private String userShippingCity;
    private String userShippingCountry;
    private boolean userShippingDefault;
    private String userShippingName;
    private String userShippingState;
    private String userShippingStreet1;
    private String userShippingStreet2;
    private String userShippingZipcode;
    private Long userId;
    private User userByUserId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_shipping_city", nullable = true, length = 255)
    public String getUserShippingCity() {
        return userShippingCity;
    }

    public void setUserShippingCity(String userShippingCity) {
        this.userShippingCity = userShippingCity;
    }

    @Basic
    @Column(name = "user_shipping_country", nullable = true, length = 255)
    public String getUserShippingCountry() {
        return userShippingCountry;
    }

    public void setUserShippingCountry(String userShippingCountry) {
        this.userShippingCountry = userShippingCountry;
    }

    @Basic
    @Column(name = "user_shipping_default", nullable = false)
    public boolean isUserShippingDefault() {
        return userShippingDefault;
    }

    public void setUserShippingDefault(boolean userShippingDefault) {
        this.userShippingDefault = userShippingDefault;
    }

    @Basic
    @Column(name = "user_shipping_name", nullable = true, length = 255)
    public String getUserShippingName() {
        return userShippingName;
    }

    public void setUserShippingName(String userShippingName) {
        this.userShippingName = userShippingName;
    }

    @Basic
    @Column(name = "user_shipping_state", nullable = true, length = 255)
    public String getUserShippingState() {
        return userShippingState;
    }

    public void setUserShippingState(String userShippingState) {
        this.userShippingState = userShippingState;
    }

    @Basic
    @Column(name = "user_shipping_street1", nullable = true, length = 255)
    public String getUserShippingStreet1() {
        return userShippingStreet1;
    }

    public void setUserShippingStreet1(String userShippingStreet1) {
        this.userShippingStreet1 = userShippingStreet1;
    }

    @Basic
    @Column(name = "user_shipping_street2", nullable = true, length = 255)
    public String getUserShippingStreet2() {
        return userShippingStreet2;
    }

    public void setUserShippingStreet2(String userShippingStreet2) {
        this.userShippingStreet2 = userShippingStreet2;
    }

    @Basic
    @Column(name = "user_shipping_zipcode", nullable = true, length = 255)
    public String getUserShippingZipcode() {
        return userShippingZipcode;
    }

    public void setUserShippingZipcode(String userShippingZipcode) {
        this.userShippingZipcode = userShippingZipcode;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
