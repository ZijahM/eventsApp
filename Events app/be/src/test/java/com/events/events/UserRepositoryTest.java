package com.events.events;


import com.events.events.entity.User;
import com.events.events.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenFindByName_thenReturnUser() {

        User zijo = new User("zijo", "zijo", "zijo");
        entityManager.persist(zijo);
        entityManager.flush();

        User found = userRepository.getByUsername(zijo.getUsername());

        assertEquals(found.getUsername(), zijo.getUsername());
    }
}
