package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.entity.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

}
