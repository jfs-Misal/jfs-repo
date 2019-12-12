package com.insure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insure.entity.Insurance;

@Repository
public interface InsuranceJPARepository extends JpaRepository<Insurance, Integer> {

}
