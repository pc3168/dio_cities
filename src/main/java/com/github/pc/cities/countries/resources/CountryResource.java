package com.github.pc.cities.countries.resources;

import com.github.pc.cities.countries.entities.Country;
import com.github.pc.cities.countries.repositories.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource (final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities(){
        return repository.findAll();
    }

    @GetMapping("/countries/page")
    public Page<Country> cities(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/countries/{id}")
    public ResponseEntity getId(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }

        return ResponseEntity.notFound().build();
    }


}
