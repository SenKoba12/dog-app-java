package com.project.dogApp.services;

import com.project.dogApp.model.Dog;

import java.util.List;

public interface IDogService {
    List<Dog> getDogs();
    Dog addDog(Dog dog);
    Dog updateDog(long id, Dog updatedData);
    Dog getDog(long id);
    void deleteDog(long id);
}
