package com.Makersharks.Makersharks.Assessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Makersharks.Makersharks.Assessment.entites.SupplierEntity;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {
//we can define our custom queries here,if have. JpaRepository handles most of the queries for us

}