package com.br.artreboucas.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.artreboucas.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
} 
    
