package com.bookst.Services;

import com.bookst.Entities.*;
import com.bookst.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CartItemService cartItemService;
    @Override
    public UserOrder createOrder(ShoppingCart shoppingCart, ShippingAddress shippingAddress, BillingAddress billingAddress, Payment payment, String shippingMethod, User user) {
        UserOrder order = new UserOrder();
        order.setBillingAddressByBillingAddressId(billingAddress);
        order.setOrderStatus("created");
        order.setPaymentByPaymentId(payment);
        order.setShippingAddressByShippingAddressId(shippingAddress);
        order.setShippingMethod(shippingMethod);

        List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);

        for(CartItem cartItem : cartItemList) {
            Book book = cartItem.getBookByBookId();
            cartItem.setUserOrderByOrderId(order);
            book.setInStockNumber(book.getInStockNumber() - cartItem.getQty());
        }

        order.setCartItemsById(cartItemList);
        order.setOrderDate((Timestamp) Calendar.getInstance().getTime());
        order.setOrderTotal(shoppingCart.getGrandTotal());
        shippingAddress.setUserOrdersById((Collection<UserOrder>) order);
        billingAddress.setUserOrdersById((Collection<UserOrder>) order);
        payment.setUserOrdersById((Collection<UserOrder>) order);
        order.setUserByUserId(user);
        order = orderRepository.save(order);

        return order;


    }

    public UserOrder findById(Long id){
        return orderRepository.getOne(id);
    }

}
