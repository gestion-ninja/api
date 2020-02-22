package fr.gestionninja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gestionninja.api.data.Ninja;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, Long> {

}