package com.bookst.Repositories;

import com.bookst.Entities.UserShipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserShippingRepository extends JpaRepository<UserShipping,Long> {
}
