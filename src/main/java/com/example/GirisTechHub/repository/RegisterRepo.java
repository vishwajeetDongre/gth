package com.example.GirisTechHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GirisTechHub.entity.Register;
@Repository("registerRepo")
public interface RegisterRepo extends JpaRepository<Register,Integer>{

}
