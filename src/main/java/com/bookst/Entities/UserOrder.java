package com.bookst.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;


@Entity
@Table(name = "user_order", schema = "bookstore", catalog = "")
public class UserOrder {
    private long id;
    private Timestamp orderDate;
    private String orderStatus;
    private BigDecimal orderTotal;
    private Timestamp shippingDate;
    private String shippingMethod;
    private Long billingAddressId;
    private Long paymentId;
    private Long shippingAddressId;
    private Long userId;
    private Collection<CartItem> cartItemsById;
    private BillingAddress billingAddressByBillingAddressId;
    private Payment paymentByPaymentId;
    private ShippingAddress shippingAddressByShippingAddressId;
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
    @Column(name = "order_date", nullable = true)
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "order_status", nullable = true, length = 255)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_total", nullable = true, precision = 2)
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Basic
    @Column(name = "shipping_date", nullable = true)
    public Timestamp getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Timestamp shippingDate) {
        this.shippingDate = shippingDate;
    }

    @Basic
    @Column(name = "shipping_method", nullable = true, length = 255)
    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    @Basic
    @Column(name = "billing_address_id", nullable = true)
    public Long getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Long billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    @Basic
    @Column(name = "payment_id", nullable = true)
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "shipping_address_id", nullable = true)
    public Long getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(Long shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }





    @OneToMany(mappedBy = "userOrderByOrderId")
    public Collection<CartItem> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItem> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }

    @ManyToOne
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    public BillingAddress getBillingAddressByBillingAddressId() {
        return billingAddressByBillingAddressId;
    }

    public void setBillingAddressByBillingAddressId(BillingAddress billingAddressByBillingAddressId) {
        this.billingAddressByBillingAddressId = billingAddressByBillingAddressId;
    }

    @ManyToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    public Payment getPaymentByPaymentId() {
        return paymentByPaymentId;
    }

    public void setPaymentByPaymentId(Payment paymentByPaymentId) {
        this.paymentByPaymentId = paymentByPaymentId;
    }

    @ManyToOne
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "id")
    public ShippingAddress getShippingAddressByShippingAddressId() {
        return shippingAddressByShippingAddressId;
    }

    public void setShippingAddressByShippingAddressId(ShippingAddress shippingAddressByShippingAddressId) {
        this.shippingAddressByShippingAddressId = shippingAddressByShippingAddressId;
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
