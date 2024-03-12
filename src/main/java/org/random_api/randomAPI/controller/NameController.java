package org.random_api.randomAPI.controller;

import org.random_api.randomAPI.entity.Name;
import org.random_api.randomAPI.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/names")
public class NameController {

    private final NameRepository nameRepository;

    @Autowired
    public NameController(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    @GetMapping
    public List<Name> getAllNames() {
        return nameRepository.findAll();
    }

    // New method to get a random name
    @GetMapping("/random")
    public Name getRandomName() {
        return nameRepository.findRandomName();
    }
}
