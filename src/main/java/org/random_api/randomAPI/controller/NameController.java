package org.random_api.randomAPI.controller;

import org.random_api.randomAPI.entity.Name;
import org.random_api.randomAPI.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
