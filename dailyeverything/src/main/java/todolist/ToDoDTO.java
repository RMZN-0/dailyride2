package todolist;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class ToDoDTO {
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime dueDate;
}
