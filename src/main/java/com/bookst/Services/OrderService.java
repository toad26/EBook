package com.bookst.Services;

import com.bookst.Entities.*;

public interface OrderService {

    UserOrder createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMethod,
                      User user);


    UserOrder findById(Long id);
}
