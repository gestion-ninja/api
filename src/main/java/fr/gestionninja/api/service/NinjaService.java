package fr.gestionninja.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gestionninja.api.data.Ninja;
import fr.gestionninja.api.repository.NinjaRepository;

import java.util.List;

@Service
public class NinjaService {

    @Autowired private NinjaRepository ninjaRepository;

    public List<Ninja> getNinjas() {
        return ninjaRepository.findAll();
    }

    public String test() {
        return ninjaRepository.test();
    }

}