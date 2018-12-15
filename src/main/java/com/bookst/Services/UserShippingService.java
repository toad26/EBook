package com.bookst.Services;

import com.bookst.Entities.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long id);

    void removeById(Long id);
}
