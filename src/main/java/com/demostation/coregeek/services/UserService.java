package com.demostation.coregeek.services;

import com.demostation.coregeek.entity.Person;
import com.demostation.coregeek.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public Person findUser(Integer id) {
        Optional<Person> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public Person insert(Person person) {
        person.setUserId(null);
        return repo.save(person);
    }

    public Person update(Person person) {
        findUser(person.getUserId());
        return repo.save(person);
    }

    public void delete(Integer id) {
        findUser(id);
        repo.deleteById(id);
    }

    public List<Person> findAll() {
        return repo.findAll();
    }

}
