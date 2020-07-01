package com.pashayev.petclinic.services;

import com.pashayev.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    public Set<Pet> findAll();

    public Pet save(Pet pet);

    public Pet findById(Long id);

}
