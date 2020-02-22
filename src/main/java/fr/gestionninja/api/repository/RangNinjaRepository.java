package fr.gestionninja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gestionninja.api.data.RangNinja;

@Repository
public interface RangNinjaRepository extends JpaRepository<RangNinja, Long> {

}