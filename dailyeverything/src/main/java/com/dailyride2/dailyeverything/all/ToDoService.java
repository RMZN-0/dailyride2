package com.dailyride2.dailyeverything.all;

import java.util.List;

public interface ToDoService {

    ToDo createToDo(ToDoDTO dto);
    List<ToDo> getAllToDos();
    ToDo getToDoById(Long id);
    ToDo updateToDo(Long id, ToDoDTO dto);
    void deleteToDo(Long id);




}
