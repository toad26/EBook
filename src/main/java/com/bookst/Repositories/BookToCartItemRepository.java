package com.bookst.Repositories;

import com.bookst.Entities.BookToCartItem;
import com.bookst.Entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface BookToCartItemRepository extends JpaRepository<BookToCartItem,Long> {

    void deleteByCartItem(CartItem cartItem);
}
