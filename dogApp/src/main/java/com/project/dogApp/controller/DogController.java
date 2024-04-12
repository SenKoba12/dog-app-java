package com.project.dogApp.controller;

import com.project.dogApp.model.Dog;
import com.project.dogApp.services.IDogService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {
    @Autowired
    private IDogService dogServ;

    @RequestMapping("/api/dogs")
    public List<Dog> findDogs(){
        return dogServ.getDogs();
    }
    @RequestMapping("/api/show-dog/{id}")
    public Dog showDog(@PathVariable long id){
        return dogServ.getDog(id);
    }
    @RequestMapping(value = "/api/add-dog", method = RequestMethod.POST)
    public Dog addDogSubmit(@RequestBody Dog dog){
        return dogServ.addDog(dog);
    }
    @RequestMapping(value = "/api/update-dog/{id}", method = RequestMethod.PUT)
    public Dog updateDog(@PathVariable int id, @RequestBody Dog updated_dog){
        return dogServ.updateDog(id, updated_dog);
    }
    @RequestMapping(value = "/api/delete-dog/{id}", method = RequestMethod.DELETE)
    public void deleteDog(@PathVariable int id){
        dogServ.deleteDog(id);
    }
}
