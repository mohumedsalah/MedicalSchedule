package com.example.medicalschedule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.medicalschedule.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
