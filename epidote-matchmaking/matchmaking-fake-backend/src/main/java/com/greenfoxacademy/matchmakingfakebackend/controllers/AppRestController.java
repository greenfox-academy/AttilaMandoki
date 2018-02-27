package com.greenfoxacademy.matchmakingfakebackend.controllers;

import com.greenfoxacademy.matchmakingfakebackend.models.Apprentice;
import com.greenfoxacademy.matchmakingfakebackend.models.Partner;
import com.greenfoxacademy.matchmakingfakebackend.services.ApprenticeService;
import com.greenfoxacademy.matchmakingfakebackend.services.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppRestController {

  @Autowired
  ApprenticeService apprenticeService;

  @Autowired
  PartnerService partnerService;

  @RequestMapping(value = "/api/apprentice/all", method = RequestMethod.GET)
  public List<Apprentice> listOfAllApprentices() {
    return apprenticeService.getAll();
  }

  @RequestMapping(value = "api/apprentice/{cohort}", method = RequestMethod.GET)
  public List<Apprentice> apprenticesByCohort(@PathVariable String cohort) {
    return apprenticeService.getAllByCohort(cohort);
  }

  @RequestMapping(value = "/api/apprentice/{cohortClass}", method = RequestMethod.GET)
  public List<Apprentice> apprenticesByClass(@PathVariable String cohortClass) {
    return apprenticeService.getAllByClassCohort(cohortClass);
  }

  @RequestMapping(value = "api/apprentice/{email}", method = RequestMethod.GET)
  public Apprentice apprenticeByEmail(@PathVariable String email) {
    return apprenticeService.getOneByEmail(email);
  }

  @RequestMapping(value = "/api/apprentice/{id}", method = RequestMethod.GET)
  public Apprentice apprenticeById(@PathVariable Integer id) {
    return apprenticeService.getOneById(id);
  }

  @RequestMapping(value = "/api/apprentice/{firstName}/{lastName}", method = RequestMethod.GET)
  public Apprentice apprenticeByName(@PathVariable String firstName, String lastName) {
    return apprenticeService.getAllByName(firstName, lastName);
}

  @RequestMapping(value = "/api/partner/all", method = RequestMethod.GET)
  public List<Partner> listOfPartners() {
    return partnerService.getAll();
  }

  @RequestMapping(value = "/api/partner/{companyName}", method = RequestMethod.GET)
  public Partner partnerByName(@PathVariable String companyName) {
    return partnerService.getOneByCompanyName(companyName);
  }

  @RequestMapping(value = "api/partner/{email}", method = RequestMethod.GET)
  public Partner partnerByEmail(@PathVariable String email) {
    return partnerService.getOneByEmail(email);
  }

  @RequestMapping(value = "/api/partner/{id}", method = RequestMethod.GET)
  public Partner partnerById(@PathVariable Integer id) {
    return partnerService.getOneById(id);
  }
}
