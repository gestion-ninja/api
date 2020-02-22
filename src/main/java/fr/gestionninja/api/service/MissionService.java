package fr.gestionninja.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gestionninja.api.data.Mission;
import fr.gestionninja.api.repository.MissionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {

    @Autowired private MissionRepository missionRepository;

    public List<Mission> getMissions() {
        return missionRepository.findAll();
    }

    public Mission getMission(String _id) {
        final Long id = Long.decode(_id);
        final Optional<fr.gestionninja.api.data.Mission> mission = missionRepository.findById(id);
        if (mission.isPresent()) {
            return mission.get();
        } else {
            return null;
        }
	}

	public Mission createMission(Mission mission) {
		return missionRepository.save(mission);
	}

	public Mission updateMission(String _id, Mission _mission) {
        final Long id = Long.decode(_id);
        final Optional<Mission> pseudoMission = missionRepository.findById(id);

        if (!pseudoMission.isPresent()) {
            return null;
        } else {
            final Mission mission = pseudoMission.get();
            mission.setTitre(_mission.getTitre());
            mission.setDescription(_mission.getDescription());
            mission.setRang(_mission.getRang());
            mission.setDateButoir(_mission.getDateButoir());
            mission.setRecompenses(_mission.getRecompenses());
            mission.setNinjas(_mission.getNinjas());
            mission.setEtatMission(_mission.getEtatMission());
    
            return missionRepository.save(mission);
        }
    }
    
    public boolean deleteMission(String _id) {
        final Long id = Long.decode(_id);
        final Optional<Mission> pseudoMission = missionRepository.findById(id);

        if (!pseudoMission.isPresent()) {
            return false;
        } else {
            final Mission mission = pseudoMission.get();
            missionRepository.delete(mission);
            return true;
        } 
    }

}