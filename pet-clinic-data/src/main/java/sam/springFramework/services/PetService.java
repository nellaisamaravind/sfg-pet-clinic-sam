package sam.springFramework.services;

import sam.springFramework.model.Pet;
// This interface holds the action for the Pet Model
import java.util.Set;

public interface PetService {
    Pet findById(Long Id);
    Pet save(Pet pet);
    Set<Pet> findAll(); // always for un ordered data use set .
}
