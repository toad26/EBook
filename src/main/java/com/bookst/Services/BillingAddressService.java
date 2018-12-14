package com.bookst.Services;

import com.bookst.Entities.BillingAddress;
import com.bookst.Entities.UserBilling;

public interface BillingAddressService {


    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
