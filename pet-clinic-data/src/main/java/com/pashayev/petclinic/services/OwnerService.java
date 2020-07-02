package com.pashayev.petclinic.services;

import com.pashayev.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    public Owner findByLastName(String lastname);
}
