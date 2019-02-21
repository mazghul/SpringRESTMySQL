package com.maz.eventCalender.repository;

import com.maz.eventCalender.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
