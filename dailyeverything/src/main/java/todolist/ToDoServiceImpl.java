package todolist;

import java.util.List;

public class ToDoServiceImpl implements ToDoService {
    private final ToDoRepository repository;

    public ToDoServiceImpl(ToDoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ToDoEntity createToDo(ToDoDTO dto) {
        ToDoEntity todo = new ToDoEntity();
        todo.setTitle(dto.getTitle());
        todo.setDescription(dto.getDescription());
        todo.setCompleted(dto.isCompleted());
        todo.setDueDate(dto.getDueDate());
        return repository.save(todo);
    }

    @Override
    public List<ToDoEntity> getAllToDos() {
        return repository.findAll();
    }

    @Override
    public ToDoEntity getToDoById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public ToDoEntity updateToDo(Long id, ToDoDTO dto) {
        ToDoEntity todo = repository.findById(id).orElseThrow();
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
