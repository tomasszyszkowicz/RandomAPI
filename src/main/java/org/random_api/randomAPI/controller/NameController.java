package org.random_api.randomAPI.controller;

import java.util.List;

import org.random_api.randomAPI.entity.Name;
import org.random_api.randomAPI.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * The NameController class handles HTTP requests related to names.
 */
@RestController
@RequestMapping("/names")
public class NameController {

    private final NameRepository nameRepository;

    /**
     * Constructs a new NameController with the given NameRepository.
     *
     * @param nameRepository the repository for managing Name entities
     */
    @Autowired
    public NameController(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    /**
     * Retrieves a random Name entity from the repository.
     *
     * @return a random Name entity
     */
    @GetMapping
    public Name getRandomName() {
        return nameRepository.findRandomName();
    }

    /**
     * Retrieves all Name entities from the repository.
     *
     * @return a list of all Name entities
     */
    @GetMapping("/all")
    public List<Name> getAllNames() {
        return nameRepository.findAll();
    }   

    /**
     * Retrieves a Name entity by its ID.
     *
     * @param id the ID of the Name entity to be retrieved
     * @return the Name entity with the given ID
     */
    @GetMapping("/all/{id}")
    public Name getNameById(@PathVariable Long id) {
        return nameRepository.findById(id).orElse(null);
    }

    /**
     * Creates and saves a new Name entity from the request body.
     *
     * @param name the Name entity to be saved
     * @return the saved Name entity
     */
    @PostMapping("/add")
    public Name addName(@RequestBody Name name) {
        return nameRepository.save(name);
    }

    /**
     * Deletes a Name entity by its ID.
     *
     * @param id the ID of the Name entity to be deleted
     * @return a ResponseEntity indicating the operation result
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteName(@PathVariable Long id) {
        if (nameRepository.existsById(id)) {
            nameRepository.deleteById(id);
            return ResponseEntity.ok().body("Name with ID " + id + " was deleted.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Updates an existing Name entity with the given ID and returns a success message.
     *
     * @param id the ID of the Name entity to be updated
     * @param newName details to update the Name entity with
     * @return a ResponseEntity with a success message
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestBody Name newName) {
        if (nameRepository.existsById(id)) {
            Name existingName = nameRepository.findById(id).get();
            existingName.setFirstName(newName.getFirstName());
            existingName.setLastName(newName.getLastName());
            // Make sure to handle other fields that need to be updated here
            nameRepository.save(existingName);
            return ResponseEntity.ok("Update successful for Name with ID " + id);
        }
        return ResponseEntity.notFound().build();
    }
}
