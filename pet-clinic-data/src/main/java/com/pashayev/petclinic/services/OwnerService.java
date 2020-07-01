package com.pashayev.petclinic.services;

import com.pashayev.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    public Set<Owner> findAll();

    public Owner save(Owner owner);

    public Owner findById(long id);

}
