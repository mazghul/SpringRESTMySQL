package com.maz.eventCalender.repository;

import com.maz.eventCalender.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {

   @Query(value = "SELECT id, subject, end_date, start_date, attachment, subject, to_email_id FROM `event` where to_email_id = :toEmailId", nativeQuery = true)
   List<Event> findByToEmail(@Param("toEmailId") String toEmailId);


    @Query(value = "SELECT id, subject, end_date, start_date, attachment, subject, to_email_id  FROM event where" +
            " (start_date > :startDate and end_date < :endDate) " +
            "OR (:startDate between start_date and end_date)" +
            " OR (:endDate between start_date and end_date)", nativeQuery = true)
    List<Event> getEventsByPeriod(@Param("startDate") String startDate, @Param("endDate") String endDate);

}
