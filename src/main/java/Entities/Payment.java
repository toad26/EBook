package Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Payment {
    private long id;
    private String cardNumber;
    private int cvc;
    private boolean defaultPayment;
    private int expiryMonth;
    private int expiryYear;
    private String holderName;
    private String type;
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
    @Column(name = "card_number", nullable = true, length = 255)
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "cvc", nullable = false)
    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    @Basic
    @Column(name = "default_payment", nullable = false)
    public boolean isDefaultPayment() {
        return defaultPayment;
    }

    public void setDefaultPayment(boolean defaultPayment) {
        this.defaultPayment = defaultPayment;
    }

    @Basic
    @Column(name = "expiry_month", nullable = false)
    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    @Basic
    @Column(name = "expiry_year", nullable = false)
    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    @Basic
    @Column(name = "holder_name", nullable = true, length = 255)
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id &&
                cvc == payment.cvc &&
                defaultPayment == payment.defaultPayment &&
                expiryMonth == payment.expiryMonth &&
                expiryYear == payment.expiryYear &&
                Objects.equals(cardNumber, payment.cardNumber) &&
                Objects.equals(holderName, payment.holderName) &&
                Objects.equals(type, payment.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardNumber, cvc, defaultPayment, expiryMonth, expiryYear, holderName, type);
    }

    @OneToMany(mappedBy = "paymentByPaymentId")
    public Collection<UserOrder> getUserOrdersById() {
        return userOrdersById;
    }

    public void setUserOrdersById(Collection<UserOrder> userOrdersById) {
        this.userOrdersById = userOrdersById;
    }
}
