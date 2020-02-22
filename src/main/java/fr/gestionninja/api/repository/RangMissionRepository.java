package fr.gestionninja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gestionninja.api.data.RangMission;

@Repository
public interface RangMissionRepository extends JpaRepository<RangMission, Long> {

}