package com.pr.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pr.model.Formation;

@RestController
public class FormationController {
@Autowired
FormationService formationService;
@GetMapping("formation")
public List<Formation> getFormations()
{
	return formationService.showFormations();
}
@PostMapping("/add")
public Formation addFormation(@Valid @RequestBody Formation f)
{
return formationService.addFormation(f);	
}
@GetMapping("formation/{id}")
public Optional<Formation> getFormationsById(@PathVariable long id)
{
	return formationService.getFormationById(id);
}
@GetMapping("formationby/{formateur}")
public List<Formation> getFormationByFormateur(@PathVariable String formateur)
{
	return formationService.getFormationByFormateur(formateur);
	
}


@DeleteMapping("/formation/{id}")
public void deleteStudent(@PathVariable long id) {

	formationService.deleteFormation(id);
}


}
