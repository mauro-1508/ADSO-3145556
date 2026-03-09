package com.sena.app.Service;

import com.sena.app.Entity.Action;
import com.sena.app.IRepository.IActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {

    @Autowired
    private IActionRepository repository;

    public Action save(Action action) {
        return repository.save(action);
    }

    public List<Action> All() {
        return repository.findAll();
    }
}