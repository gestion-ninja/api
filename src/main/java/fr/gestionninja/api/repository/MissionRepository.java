package fr.gestionninja.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gestionninja.api.data.EtatMission;
import fr.gestionninja.api.data.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

    public List<Mission> findMissionsByEtatMission(EtatMission etatMission);

}