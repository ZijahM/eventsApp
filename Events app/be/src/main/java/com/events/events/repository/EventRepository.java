package com.events.events.repository;


import com.events.events.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Event getEventByAddress (String address);
    Event getEventByAgegroup (int age);
    List <Event> getAllByAddress (String address);
    List <Event> getAllByAgegroup (int age);
    List <Event> getAllByGenre (String genre);
    List <Event> getALlByType (String type);
    Event getEventById (Long id);
    Event getEventByType (String type);

}
