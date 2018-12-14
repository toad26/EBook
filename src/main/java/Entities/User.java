package Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    private long id;
    private String email;
    private boolean enabled;
    private String firstName;
    private String lastName;
    private String password;
    private String phone;
    private String username;
    private Collection<PasswordResetToken> passwordResetTokensById;
    private Collection<ShoppingCart> shoppingCartsById;
    private Collection<UserOrder> userOrdersById;
    private Collection<UserPayment> userPaymentsById;
    private Collection<UserRole> userRolesById;
    private Collection<UserShipping> userShippingsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "enabled", nullable = false)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 255)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                enabled == user.enabled &&
                Objects.equals(email, user.email) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, enabled, firstName, lastName, password, phone, username);
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<PasswordResetToken> getPasswordResetTokensById() {
        return passwordResetTokensById;
    }

    public void setPasswordResetTokensById(Collection<PasswordResetToken> passwordResetTokensById) {
        this.passwordResetTokensById = passwordResetTokensById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<ShoppingCart> getShoppingCartsById() {
        return shoppingCartsById;
    }

    public void setShoppingCartsById(Collection<ShoppingCart> shoppingCartsById) {
        this.shoppingCartsById = shoppingCartsById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserOrder> getUserOrdersById() {
        return userOrdersById;
    }

    public void setUserOrdersById(Collection<UserOrder> userOrdersById) {
        this.userOrdersById = userOrdersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserPayment> getUserPaymentsById() {
        return userPaymentsById;
    }

    public void setUserPaymentsById(Collection<UserPayment> userPaymentsById) {
        this.userPaymentsById = userPaymentsById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserRole> getUserRolesById() {
        return userRolesById;
    }

    public void setUserRolesById(Collection<UserRole> userRolesById) {
        this.userRolesById = userRolesById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserShipping> getUserShippingsById() {
        return userShippingsById;
    }

    public void setUserShippingsById(Collection<UserShipping> userShippingsById) {
        this.userShippingsById = userShippingsById;
    }
}
