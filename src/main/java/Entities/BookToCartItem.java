package Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "book_to_cart_item", schema = "bookstore", catalog = "")
public class BookToCartItem {
    private long id;
    private Long bookId;
    private Long cartItemId;
    private Book bookByBookId;
    private CartItem cartItemByCartItemId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "cart_item_id", nullable = true)
    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookToCartItem that = (BookToCartItem) o;
        return id == that.id &&
                Objects.equals(bookId, that.bookId) &&
                Objects.equals(cartItemId, that.cartItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookId, cartItemId);
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
    @JoinColumn(name = "cart_item_id", referencedColumnName = "id")
    public CartItem getCartItemByCartItemId() {
        return cartItemByCartItemId;
    }

    public void setCartItemByCartItemId(CartItem cartItemByCartItemId) {
        this.cartItemByCartItemId = cartItemByCartItemId;
    }
}
