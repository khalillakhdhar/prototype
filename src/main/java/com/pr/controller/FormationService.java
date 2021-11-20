package com.pr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pr.exception.ResourceNotFoundException;
import com.pr.model.Formation;
import com.pr.model.repository.FormationRepository;

@Service
public class FormationService {
@Autowired
FormationRepository formationRepository;
public List<Formation> showFormations()
{
	return formationRepository.findAll();
	// select * from formation

}
public Formation addFormation(Formation f)
{
	return formationRepository.save(f);

}
public Optional<Formation> getFormationById(long id)
{
return  formationRepository.findById(id);	
}
public ResponseEntity<?> deleteFormation(long id)
{
	 Formation formation = formationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("formation","id",id) );
 formationRepository.delete(formation);
 
 return ResponseEntity.ok().build();

}

}
