package com.pr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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





}
