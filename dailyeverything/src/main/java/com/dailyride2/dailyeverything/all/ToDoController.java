package com.dailyride2.dailyeverything.all;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {
    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @PostMapping
    public ToDo createToDo(@RequestBody ToDoDTO dto) {
        return service.createToDo(dto);
    }

    @GetMapping
    public List<ToDo> getAllTodos() {
        return service.getAllToDos();
    }

    @GetMapping("/{id}")
    public ToDo getToDoById(@PathVariable Long id) {
        return service.getToDoById(id);
    }

    @PutMapping("/{id}")
    public ToDo updateToDo(@PathVariable Long id, @RequestBody ToDoDTO dto) {
        return service.updateToDo(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable Long id) {
        service.deleteToDo(id);
    }

}
