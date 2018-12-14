package com.bookst.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;


@Entity
@Table(name = "cart_item", schema = "bookstore", catalog = "")
public class CartItem {
    private long id;
    private int qty;
    private BigDecimal subtotal;
    private Long bookId;
    private Long orderId;
    private Long shoppingCartId;
    private Collection<BookToCartItem> bookToCartItemsById;
    private Book bookByBookId;
    private UserOrder userOrderByOrderId;
    private ShoppingCart shoppingCartByShoppingCartId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "qty", nullable = false)
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "subtotal", nullable = true, precision = 2)
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @Basic
    @Column(name = "book_id", nullable = true)
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "order_id", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "shopping_cart_id", nullable = true)
    public Long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(Long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }


    @OneToMany(mappedBy = "cartItemByCartItemId")
    public Collection<BookToCartItem> getBookToCartItemsById() {
        return bookToCartItemsById;
    }

    public void setBookToCartItemsById(Collection<BookToCartItem> bookToCartItemsById) {
        this.bookToCartItemsById = bookToCartItemsById;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    public Book getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(Book bookByBookId) {
        this.bookByBookId = bookByBookId;
    }

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    public UserOrder getUserOrderByOrderId() {
        return userOrderByOrderId;
    }

    public void setUserOrderByOrderId(UserOrder userOrderByOrderId) {
        this.userOrderByOrderId = userOrderByOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id")
    public ShoppingCart getShoppingCartByShoppingCartId() {
        return shoppingCartByShoppingCartId;
    }

    public void setShoppingCartByShoppingCartId(ShoppingCart shoppingCartByShoppingCartId) {
        this.shoppingCartByShoppingCartId = shoppingCartByShoppingCartId;
    }
}
