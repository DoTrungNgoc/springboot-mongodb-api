package com.example.springbootmogodb.service;

import com.example.springbootmogodb.exception.TodoCollectionException;
import com.example.springbootmogodb.model.TodoDTO;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;
import java.util.List;

@Service
public interface TodoService {

    void createTodo(TodoDTO todo) throws ConstraintViolationException,TodoCollectionException;

    List<TodoDTO> getAllTodos();

    TodoDTO getSingleTodo(String id) throws TodoCollectionException;

    void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;

    void deleteTodo(String id) throws TodoCollectionException;
}
