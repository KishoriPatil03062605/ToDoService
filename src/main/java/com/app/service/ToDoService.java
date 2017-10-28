package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.TaskRepository;
import com.app.dao.ToDoRepository;
import com.app.entity.ToDos;

/**
 * @author kishori
 *
 */

@Component
public class ToDoService {

	@Autowired
	ToDoRepository toDoRepository;
	
	@Autowired
	TaskRepository taskRepository;

	public ToDos getTodosForUser(String userId) {
		ToDos toDos = toDoRepository.findByUserId(userId);
		if (toDos != null) {
			return toDos;
		}
		toDos = new ToDos();
		toDos.setUserId(userId);
		return toDoRepository.save(toDos);
	}

	public ToDos updateTodosForUser(ToDos toDos) {
		ToDos originalToDos = toDoRepository.findOne(toDos.getId());
		originalToDos.setTasks(toDos.getTasks());
		return toDoRepository.save(originalToDos);
	}

}
