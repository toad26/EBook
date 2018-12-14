package Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingAddress that = (ShippingAddress) o;
        return id == that.id &&
                Objects.equals(shippingAddressCity, that.shippingAddressCity) &&
                Objects.equals(shippingAddressCountry, that.shippingAddressCountry) &&
                Objects.equals(shippingAddressName, that.shippingAddressName) &&
                Objects.equals(shippingAddressState, that.shippingAddressState) &&
                Objects.equals(shippingAddressStreet1, that.shippingAddressStreet1) &&
                Objects.equals(shippingAddressStreet2, that.shippingAddressStreet2) &&
                Objects.equals(shippingAddressZipcode, that.shippingAddressZipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shippingAddressCity, shippingAddressCountry, shippingAddressName, shippingAddressState, shippingAddressStreet1, shippingAddressStreet2, shippingAddressZipcode);
    }

    @OneToMany(mappedBy = "shippingAddressByShippingAddressId")
    public Collection<UserOrder> getUserOrdersById() {
        return userOrdersById;
    }

    public void setUserOrdersById(Collection<UserOrder> userOrdersById) {
        this.userOrdersById = userOrdersById;
    }
}
