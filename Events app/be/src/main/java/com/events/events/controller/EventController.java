package com.events.events.controller;

import com.events.events.entity.Event;
import com.events.events.entity.User;
import com.events.events.service.EventService;
import com.events.events.service.UserService;
import com.events.events.service.dto.EventDTO;
import com.events.events.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/event")
public class EventController {
    private  EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/create")
    public void createEvent(@RequestBody EventDTO eventDTO,
                                               @RequestHeader("Authorization") String token){
        eventService.save(eventDTO);

    }
}
