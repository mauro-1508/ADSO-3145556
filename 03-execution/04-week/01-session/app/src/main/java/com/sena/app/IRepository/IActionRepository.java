package com.sena.app.IRepository;

import com.sena.app.Entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IActionRepository extends JpaRepository<Action, Long> {
}