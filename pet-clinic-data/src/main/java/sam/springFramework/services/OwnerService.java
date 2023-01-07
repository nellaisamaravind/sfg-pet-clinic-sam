package sam.springFramework.services;

// This interface holds the action for the Owner Model .
// All actions should be service & interface
// Dependency Injection Principle
//Currently following CRUD Intreface

import sam.springFramework.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long Id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll(); // always for un ordered data use set .
}
