package fr.gestionninja.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gestionninja.api.data.Ninja;
import fr.gestionninja.api.repository.NinjaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired private NinjaRepository ninjaRepository;

    public List<Ninja> getNinjas() {
        return ninjaRepository.findAll();
    }

    public Ninja getNinja(String _id) {
        final Long id = Long.decode(_id);
        final Optional<Ninja> ninja = ninjaRepository.findById(id);
        if (ninja.isPresent()) {
            return ninja.get();
        } else {
            return null;
        }
	}

	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

	public Ninja updateNinja(String _id, Ninja _ninja) {
        final Long id = Long.decode(_id);
        final Optional<Ninja> pseudoNinja = ninjaRepository.findById(id);

        if (!pseudoNinja.isPresent()) {
            return null;
        } else {
            final Ninja ninja = pseudoNinja.get();
            ninja.setAffinitees(_ninja.getAffinitees());
            ninja.setNom(_ninja.getNom());
            ninja.setPrenom(_ninja.getPrenom());
            ninja.setRang(_ninja.getRang());
            ninja.setStatistiques(_ninja.getStatistiques());
    
            return ninjaRepository.save(ninja);
        }
    }
    
    public boolean deleteNinja(String _id) {
        final Long id = Long.decode(_id);
        final Optional<Ninja> pseudoNinja = ninjaRepository.findById(id);

        if (!pseudoNinja.isPresent()) {
            return false;
        } else {
            final Ninja ninja = pseudoNinja.get();
            ninjaRepository.delete(ninja);
            return true;
        }
        
    }

}