package com.maz.eventCalender.repository;

import com.maz.eventCalender.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {

   // @Query(value="SELECT * FROM event where to_email_id = :toEmailId");
    public List<Event> findByToEmailId(String toEmailId);
}
