package com.greenfoxacademy.practice_cognitive_apprenticeship.Services;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import com.greenfoxacademy.practice_cognitive_apprenticeship.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

  @Autowired
  OwnerRepository ownerRepository;

  @Override
  public List<Owner> findAll() {
    return (List<Owner>) ownerRepository.findAll();
  }

  @Override
  public Owner findById(long id) {
    return ownerRepository.findOne(id);
  }

  @Override
  public Owner findByOwnerName(Owner owner) {
    return ownerRepository.findByOwnerName(owner.getOwnerName());
  }

  @Override
  public List<Owner> findAllByOwnerName(Owner owner) {
    return (List<Owner>) ownerRepository.findAllByOwnerName(owner.getOwnerName());
  }

  @Override
  public void saveNewOwner(Owner owner) {
    if (ownerRepository.findByOwnerName(owner.getOwnerName()) == null) {
      ownerRepository.save(owner);
    }
  }
}
