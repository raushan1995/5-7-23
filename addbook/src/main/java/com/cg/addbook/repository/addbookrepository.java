package com.cg.addbook.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.addbook.model.AddBook;

public interface addbookrepository extends MongoRepository<String,AddBook>{

	AddBook save(AddBook addbook);

	Optional<String> findById(String title);

	

}
