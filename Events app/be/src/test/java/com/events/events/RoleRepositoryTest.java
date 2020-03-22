package com.events.events;

import com.events.events.entity.Role;
import com.events.events.entity.RoleName;
import com.events.events.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RoleRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void whenFindByName_thenReturnUser() {

        Role nermana = new Role(RoleName.ROLE_USER);
        entityManager.persist(nermana);
        entityManager.flush();

        Role found = roleRepository.getByName(nermana.getName());

        assertEquals(found.getName(), nermana.getName());
    }

}