package sam.springFramework.services;


import sam.springFramework.model.Vet;
// This interface holds the action for the Vet Model
import java.util.Set;

public interface VetService {

    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll(); // always for un ordered data use set
}
