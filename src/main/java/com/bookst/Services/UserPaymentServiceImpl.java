package com.bookst.Services;

import com.bookst.Entities.UserPayment;
import com.bookst.Repositories.UserPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserPaymentServiceImpl implements UserPaymentService {


    @Autowired
    UserPaymentRepository userPaymentRepository;


    @Override
    public UserPayment findById(Long id) {
        return userPaymentRepository.getOne(id);
    }

    @Override
    public void removeById(Long id) {
        userPaymentRepository.deleteById(id);
    }
}
