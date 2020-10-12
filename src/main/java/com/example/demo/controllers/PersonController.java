package com.example.demo.controllers;

import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PersonController {
    @GetMapping("/person")
    public List<Person> getPerson() {
        return new PersonRepository().get();
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Integer id) {
        return new PersonRepository().get(id);
    }

    @PostMapping (path = "/person", consumes = "application/json", produces = "application/json")
    public Person createObject(@RequestBody Person person) {
        return new PersonRepository().create(person);
    }

    @PutMapping (path = "/person/{id}", consumes = "application/json", produces = "application/json")
    public Person updateObject(@PathVariable Integer id, @RequestBody Person person) {
        return new PersonRepository().update(id, person);
    }

    @DeleteMapping (path = "/person/{id}")
    public Person delete(@PathVariable Integer id) {
        return new PersonRepository().delete(id);
    }
}
