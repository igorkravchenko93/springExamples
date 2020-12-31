package com.kravchenko.web;


import com.kravchenko.repository.DairyRepository;
import com.kravchenko.model.Dairy;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/dairy")
@AllArgsConstructor
public class DairyController {

    private final DairyRepository dairyRepository;

    @PostMapping(path = "/create")
    public ResponseEntity<String> createBlog(@RequestParam String dairyName, @RequestParam String dairyOwner) {
        Dairy build = Dairy.builder().dairyName(dairyName).dairyOwnerName(dairyOwner).build();
        dairyRepository.save(build);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Dairy>> getAll() {
        List<Dairy> all = dairyRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);

    }

}
