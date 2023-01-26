package com.ssg.sausagedutchpayapi.dutchpay.repository;

import com.ssg.sausagedutchpayapi.dutchpay.entity.CartShareCal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartShareCalRepository extends JpaRepository<CartShareCal, Long> {

    Optional<CartShareCal> findByCartShareOrdId(Long cartShareOrdId);
}
