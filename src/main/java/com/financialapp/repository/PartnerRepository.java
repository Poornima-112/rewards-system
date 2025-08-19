package com.financialapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financialapp.entity.Partner;

public interface PartnerRepository extends JpaRepository<Partner, Integer> {
}
