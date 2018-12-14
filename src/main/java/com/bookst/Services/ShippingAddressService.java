package com.bookst.Services;

import com.bookst.Entities.ShippingAddress;
import com.bookst.Entities.UserShipping;

public interface ShippingAddressService {

    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);

}
