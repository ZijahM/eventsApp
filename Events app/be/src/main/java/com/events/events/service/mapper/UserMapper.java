package com.events.events.service.mapper;

import com.events.events.entity.User;
import com.events.events.service.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface UserMapper {
    User toEntity (UserDTO userDTO);
    UserDTO toDto (User user);

}
