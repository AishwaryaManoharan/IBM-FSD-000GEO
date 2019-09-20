package com.example.springrecipe.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springrecipe.model.Notes;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Integer> {

}