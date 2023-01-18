package com.demostation.coregeek.resources;

import com.demostation.coregeek.entity.Person;
import com.demostation.coregeek.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> listUsers(@PathVariable Integer id) {
        Person person = service.findUser(id);
        return ResponseEntity.ok().body(person);
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Person person) {
        person = service.insert(person);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(person.getUserId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Person person, @PathVariable Integer id) {
        person.setUserId(id);
        person = service.update(person);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Person>> findAll() {
        List<Person> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
