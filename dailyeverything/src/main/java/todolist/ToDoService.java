package todolist;

import java.util.List;

public interface ToDoService {

    ToDoEntity createToDo(ToDoDTO dto);
    List<ToDoEntity> getAllToDos();
    ToDoEntity getToDoById(Long id);
    ToDoEntity updateToDo(Long id, ToDoDTO dto);
    void deleteToDo(Long id);




}
