package com.Task.Task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Task.Task1.dto.Tdto;

@Component
public interface Trepository extends JpaRepository<Tdto, Integer> {

}
