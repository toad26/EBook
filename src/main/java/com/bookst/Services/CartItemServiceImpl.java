package com.bookst.Services;

import com.bookst.Entities.*;
import com.bookst.Repositories.BookToCartItemRepository;
import com.bookst.Repositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.List;
@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private BookToCartItemRepository bookToCartItemRepository;


    @Override
    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }

    @Override
    public CartItem updateCartItem(CartItem cartItem) {
        BigDecimal bigDecimal = new BigDecimal(cartItem.getBookByBookId().getOurPrice()).multiply(new BigDecimal(cartItem.getQty()));

        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        cartItem.setSubtotal(bigDecimal);

        cartItemRepository.save(cartItem);

        return cartItem;
    }

    @Override
    public CartItem addBookToCartItem(Book book, User user, int qty) {

        List<CartItem> cartItemList = findByShoppingCart((ShoppingCart) user.getShoppingCartsById());

        for (CartItem cartItem : cartItemList) {
            if (book.getId() == cartItem.getBookId()) {
                cartItem.setQty(cartItem.getQty() + qty);
                cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
                cartItemRepository.save(cartItem);
                return cartItem;
            }

            cartItem.setShoppingCartByShoppingCartId((ShoppingCart) user.getShoppingCartsById());
            cartItem.setBookByBookId(book);

            cartItem.setQty(qty);
            cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
            cartItem = cartItemRepository.save(cartItem);

            BookToCartItem bookToCartItem = new BookToCartItem();
            bookToCartItem.setBookByBookId(book);
            bookToCartItem.setCartItemByCartItemId(cartItem);
            bookToCartItemRepository.save(bookToCartItem);

            return cartItem;
        }
        return null;
    }

    @Override
    public CartItem findById(Long id) {
        return cartItemRepository.getOne(id);
    }

    @Override
    public void removeCartItem(CartItem cartItem) {
        bookToCartItemRepository.deleteByCartItem(cartItem);
        cartItemRepository.delete(cartItem);

    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }
}
