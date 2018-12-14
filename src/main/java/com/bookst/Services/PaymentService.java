package com.bookst.Services;

import com.bookst.Entities.Payment;
import com.bookst.Entities.UserPayment;

public interface PaymentService {

    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
