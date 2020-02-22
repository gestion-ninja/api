package fr.gestionninja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gestionninja.api.data.Affinitee;

@Repository
public interface AffiniteRepository extends JpaRepository<Affinitee, Long> {

}