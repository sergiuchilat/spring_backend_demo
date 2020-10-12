package com.example.demo.repositories;

import com.example.demo.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonRepository {
    List<Person> persons = new ArrayList<Person>();
    {
        persons.add(new Person("Ion"));
        persons.add(new Person("Ana"));
        persons.add(new Person("Maria"));
        persons.add(new Person("Mihai"));
    }

    public Person create(Person person) {
        persons.add(person);
        return person;
    }

    public Person update(Integer id, Person personNewInfo) {
        Person searchedPerson = persons.stream().filter(el -> el.getId().equals(id)).findFirst().orElse(null);
        assert searchedPerson != null;
        searchedPerson.setName(personNewInfo.getName());
        return searchedPerson;
    }

    public List<Person> get() {
        return persons;
    }

    public Person get(Integer id) {
        return persons.stream().filter(el -> el.getId().equals(id)).findFirst().orElse(null);
    }

    public Person delete(Integer id) {
        return persons.stream().filter(el -> el.getId().equals(id)).findFirst().orElse(null);
    }
}
