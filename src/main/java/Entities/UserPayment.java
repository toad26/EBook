package Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user_payment", schema = "bookstore", catalog = "")
public class UserPayment {
    private long id;
    private String cardName;
    private String cardNumber;
    private int cvc;
    private boolean defaultPayment;
    private int expiryMonth;
    private int expiryYear;
    private String holderName;
    private String type;
    private Long userId;
    private Collection<UserBilling> userBillingsById;
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
    @Column(name = "card_name", nullable = true, length = 255)
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
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

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPayment that = (UserPayment) o;
        return id == that.id &&
                cvc == that.cvc &&
                defaultPayment == that.defaultPayment &&
                expiryMonth == that.expiryMonth &&
                expiryYear == that.expiryYear &&
                Objects.equals(cardName, that.cardName) &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(holderName, that.holderName) &&
                Objects.equals(type, that.type) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardName, cardNumber, cvc, defaultPayment, expiryMonth, expiryYear, holderName, type, userId);
    }

    @OneToMany(mappedBy = "userPaymentByUserPaymentId")
    public Collection<UserBilling> getUserBillingsById() {
        return userBillingsById;
    }

    public void setUserBillingsById(Collection<UserBilling> userBillingsById) {
        this.userBillingsById = userBillingsById;
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
