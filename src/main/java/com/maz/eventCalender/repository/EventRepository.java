package com.maz.eventCalender.repository;

import com.maz.eventCalender.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {

   @Query("SELECT event FROM event as event where event.to_email_id = :toEmailId")
   public List<Event> findByEmail(String toEmailId);


    //@Query("Select event from Event as event where event_id between :startDate and  :endDate")
   // public List<Event> getEventsByPeriod(String startDate, String endDate);

    //SELECT * FROM `event`where (start_date BETWEEN "2019-01-01T09:00" and  "2019-01-01T11:00") or (end_date BETWEEN "2019-01-01T09:00" and  "2018-01-01T11:00")
}
