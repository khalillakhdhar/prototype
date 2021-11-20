package com.pr.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pr.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
List<Formation> findByformateur(String formateur);
}
