package com.dailyride2.dailyeverything.all;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ToDoServiceImpl implements ToDoService {
    private final ToDoRepository repository;

    @Override
    public ToDo createToDo(ToDoDTO dto) {
        ToDo todo = new ToDo();
        todo.setTitle(dto.getTitle());
        todo.setDescription(dto.getDescription());
        todo.setCompleted(dto.isCompleted());
        todo.setDueDate(dto.getDueDate());
        return repository.save(todo);
    }

    @Override
    public List<ToDo> getAllToDos() {
        return repository.findAll();
    }

    @Override
    public ToDo getToDoById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public ToDo updateToDo(Long id, ToDoDTO dto) {
        ToDo todo = repository.findById(id).orElseThrow();
        todo.setTitle(dto.getTitle());
        todo.setDescription(dto.getDescription());
        todo.setCompleted(dto.isCompleted());
        todo.setDueDate(dto.getDueDate());
        return repository.save(todo);
    }

    @Override
    public void deleteToDo(Long id) {
        repository.deleteById(id);

    }

}
