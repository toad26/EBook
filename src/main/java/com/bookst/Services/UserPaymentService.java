package com.bookst.Services;

import com.bookst.Entities.UserPayment;



public interface UserPaymentService {

    UserPayment findById(Long id);

    void removeById(Long id);
}
