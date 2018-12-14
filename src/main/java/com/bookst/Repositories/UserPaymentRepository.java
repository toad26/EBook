package com.bookst.Repositories;

import com.bookst.Entities.UserPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentRepository extends JpaRepository<UserPayment,Long> {
}
