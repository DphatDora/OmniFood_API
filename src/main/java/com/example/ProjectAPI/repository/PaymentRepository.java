package com.example.ProjectAPI.repository;

import com.example.ProjectAPI.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}

