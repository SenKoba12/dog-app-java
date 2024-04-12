package com.project.dogApp.services;

import com.project.dogApp.model.Dog;
import com.project.dogApp.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService implements IDogService {
    @Autowired
    private DogRepository repository;

    public List<Dog> getDogs() {
        return (List<Dog>) repository.findAll();
    }

    public Dog getDog(long id) {
        Optional optional=repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Dog) optional.get();
    }

    public Dog addDog(Dog dog) {
        return repository.save(dog);
    }

    public Dog updateDog(long id, Dog updatedData) {
        Optional<Dog> dog = repository.findById(id);
        if(dog.isPresent()) {
            Dog existingData = dog.get();

            existingData.setName(updatedData.getName());
            existingData.setBreed(updatedData.getBreed());
            existingData.setAge(updatedData.getAge());
            existingData.setColor(updatedData.getColor());
            existingData.setStatus(updatedData.getStatus());
            existingData.setImage(updatedData.getImage());

            return repository.save(existingData);
        }
        else
            return null;
    }

    public void deleteDog(long id)
    {
        Optional<Dog> dog = repository.findById(id);
        if(dog.isPresent()) {
            repository.delete(dog.get());
        }
    }




}