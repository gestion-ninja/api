package fr.gestionninja.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gestionninja.api.data.Affinitee;
import fr.gestionninja.api.data.RangMission;
import fr.gestionninja.api.data.RangNinja;
import fr.gestionninja.api.repository.AffiniteRepository;
import fr.gestionninja.api.repository.RangMissionRepository;
import fr.gestionninja.api.repository.RangNinjaRepository;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class ParametreService {

    @Autowired private RangNinjaRepository rangNinjaRepository;
    @Autowired private RangMissionRepository rangMissionRepository;
    @Autowired private AffiniteRepository affiniteRepository;

    public List<RangNinja> getRangsNinjas() {
        return rangNinjaRepository.findAll();
    }

    public int addRangsNinjas(List<RangNinja> rangsNinja) {
        return rangNinjaRepository.saveAll(rangsNinja).size();
    }

    public List<RangMission> getRangsMission() {
        return rangMissionRepository.findAll();
    }

    public int addRangsMission(List<RangMission> rangsMission) {
        return rangMissionRepository.saveAll(rangsMission).size();
    }

    public List<Affinitee> getAffinitees() {
        return affiniteRepository.findAll();
    }

    public int addAffinitees(List<Affinitee> affinitees) {
        return affiniteRepository.saveAll(affinitees).size();
    }
    
}