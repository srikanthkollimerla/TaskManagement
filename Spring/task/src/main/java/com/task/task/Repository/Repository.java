package com.task.task.Repository;

import com.task.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Task,Long> {
}
