package com.events.events.service.mapper;

import com.events.events.entity.Event;
import com.events.events.service.dto.EventDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel = "spring")
public interface EventMapper {
   // @Mapping(source = "user_id", target = "user_id.id")
    Event toEntity (EventDTO eventDTO);

    //@Mapping(source = "user_id.id", target = "user_id")
    EventDTO toDto (Event event);

}
