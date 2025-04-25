package com.dailyride2.dailyeverything.all;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @NotNull
    private String description;
    private boolean completed;

    private LocalDateTime createdAt;
    private LocalDateTime dueDate;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }


}

