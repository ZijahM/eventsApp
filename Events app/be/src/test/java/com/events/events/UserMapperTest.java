package com.events.events;


import com.events.events.entity.User;
import com.events.events.service.dto.UserDTO;
import com.events.events.service.mapper.UserMapper;
import com.events.events.service.mapper.UserMapperImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class UserMapperTest {
    UserMapperImpl userMapper;


    @Before
    public void setup() {
        userMapper = new UserMapperImpl();
    }

    @Test
    public void MapperTest() {
        User sanja = new User("sanja", "sanja", "sanja");
        UserDTO sanjaDTO = userMapper.toDto(sanja);

        assertEquals(sanja.getUsername(), sanjaDTO.getUsername());

    }


}
