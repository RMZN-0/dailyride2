package todolist;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    private LocalDateTime createdAt;
    private LocalDateTime dueDate;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
}

