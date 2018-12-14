package com.bookst.Services;

import com.bookst.Entities.Book;
import com.bookst.Entities.CartItem;
import com.bookst.Entities.ShoppingCart;
import com.bookst.Entities.User;

import java.util.List;

public interface CartItemService {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addBookToCartItem(Book book, User user, int qty);

    CartItem findById(Long id);

    void removeCartItem(CartItem cartItem);

    CartItem save(CartItem cartItem);


}
