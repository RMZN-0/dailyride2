package todolist;

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
    public ToDoEntity createTodo(@RequestBody ToDoDTO dto) {
        return service.createToDo(dto);
    }

    @GetMapping
    public List<ToDoEntity> getAllTodos() {
        return service.getAllToDos();
    }

    @GetMapping("/{id}")
    public ToDoEntity getTodoById(@PathVariable Long id) {
        return service.getToDoById(id);
    }

    @PutMapping("/{id}")
    public ToDoEntity updateTodo(@PathVariable Long id, @RequestBody ToDoDTO dto) {
        return service.updateToDo(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        service.deleteToDo(id);
    }

}
