package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.ToDos;

@Repository
public interface ToDoRepository extends MongoRepository<ToDos, String> {

	ToDos findByUserId(String userId);

}
