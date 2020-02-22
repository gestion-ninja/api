package fr.gestionninja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gestionninja.api.data.EtatMission;

@Repository
public interface EtatMissionRepository extends JpaRepository<EtatMission, Long> {

}