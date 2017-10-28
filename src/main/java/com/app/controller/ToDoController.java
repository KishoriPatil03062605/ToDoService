/**
 * 
 */
package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.app.entity.ToDos;
import com.app.service.ToDoService;

/**
 * @author kishori
 *
 */

@RestController
@CrossOrigin
public class ToDoController {

	@Autowired
	ToDoService toDoService;
	
	@RequestMapping(value="getToDos/{userId}", method=RequestMethod.GET)
	ToDos getTodosForUser(@PathVariable("userId") String userId) {
		return toDoService.getTodosForUser(userId); 
	}
	
	@RequestMapping(value="updateToDos", method=RequestMethod.PUT)
	ToDos updateTodosForUser(@RequestBody ToDos toDos) {
		return toDoService.updateTodosForUser(toDos); 
	}
}
