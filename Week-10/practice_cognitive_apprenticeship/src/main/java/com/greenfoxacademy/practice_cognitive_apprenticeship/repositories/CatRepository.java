package com.greenfoxacademy.practice_cognitive_apprenticeship.repositories;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {

  List<Cat> findByNameContaining(String search);

  List<Cat> findAllByBreedContaining(String search);

}
