package com.sena.app.Service;

import com.sena.app.Entity.Person;
import com.sena.app.IRepository.IPersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private IPersonRepository repository;
    
    public Person save(Person person) {
        return repository.save(person);
    }

    public List<Person> All() {
        return repository.findAll();
    }

}