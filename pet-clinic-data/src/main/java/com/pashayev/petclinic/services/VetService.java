package com.pashayev.petclinic.services;

import com.pashayev.petclinic.model.Pet;

import java.util.Set;

public interface VetService {

    public Set<Pet> findAll();

    public Pet save(Pet pet);

    public Pet findById(Long id);

}
