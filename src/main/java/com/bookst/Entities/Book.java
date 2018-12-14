package com.bookst.Entities;

import javax.persistence.*;
import java.util.Collection;


@Entity
public class Book {
    private long id;
    private boolean active;
    private String author;
    private String category;
    private String description;
    private String format;
    private int inStockNumber;
    private int isbn;
    private String language;
    private double listPrice;
    private int numberOfPages;
    private double ourPrice;
    private String publicationDate;
    private String publisher;
    private double shippingWeight;
    private String title;
    private Collection<BookToCartItem> bookToCartItemsById;
    private Collection<CartItem> cartItemsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 255)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "category", nullable = true, length = 255)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "format", nullable = true, length = 255)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "in_stock_number", nullable = false)
    public int getInStockNumber() {
        return inStockNumber;
    }

    public void setInStockNumber(int inStockNumber) {
        this.inStockNumber = inStockNumber;
    }

    @Basic
    @Column(name = "isbn", nullable = false)
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "language", nullable = true, length = 255)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "list_price", nullable = false, precision = 0)
    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    @Basic
    @Column(name = "number_of_pages", nullable = false)
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Basic
    @Column(name = "our_price", nullable = false, precision = 0)
    public double getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(double ourPrice) {
        this.ourPrice = ourPrice;
    }

    @Basic
    @Column(name = "publication_date", nullable = true, length = 255)
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Basic
    @Column(name = "publisher", nullable = true, length = 255)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "shipping_weight", nullable = false, precision = 0)
    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @OneToMany(mappedBy = "bookByBookId")
    public Collection<BookToCartItem> getBookToCartItemsById() {
        return bookToCartItemsById;
    }

    public void setBookToCartItemsById(Collection<BookToCartItem> bookToCartItemsById) {
        this.bookToCartItemsById = bookToCartItemsById;
    }

    @OneToMany(mappedBy = "bookByBookId")
    public Collection<CartItem> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItem> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }
}
