package com.events.events.service;

import com.events.events.entity.Event;
import com.events.events.repository.EventRepository;
import com.events.events.service.dto.EventDTO;
import com.events.events.service.mapper.EventMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class EventService {
    private  EventMapper eventMapper;
    private EventRepository eventRepository;

    public EventService(EventMapper eventMapper, EventRepository eventRepository) {
        this.eventMapper = eventMapper;
        this.eventRepository = eventRepository;
    }

    public EventDTO save(EventDTO eventDTO){
        Event event = eventMapper.toEntity(eventDTO);
        event = eventRepository.save(event);
        return eventMapper.toDto(event);
    }
}
