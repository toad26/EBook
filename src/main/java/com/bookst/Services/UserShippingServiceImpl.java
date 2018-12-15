package com.bookst.Services;

import com.bookst.Entities.UserShipping;
import com.bookst.Repositories.UserShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;

    @Override
    public UserShipping findById(Long id) {
        return userShippingRepository.getOne(id);
    }

    @Override
    public void removeById(Long id) {
        userShippingRepository.deleteById(id);

    }
}
