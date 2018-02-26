package com.greenfoxacademy.matchmakingfakebackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "partner")
public class Partner extends User {

  @Column(name = "company_name", nullable = false)
  private String companyName;

  public Partner() {
    super();
  }

  public Partner(String companyName) {
    super();
    this.companyName = companyName;
  }

  public Partner(String email,  String companyName) {
    super(email);
    this.companyName = companyName;
  }

  public Partner(String email, String phoneNumber, String companyName) {
    super(email, phoneNumber);
    this.companyName = companyName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Override
  public String toString() {
    return  "Partner{ id : " + this.id
            + ", Company name : " + this.companyName
            + ", Email : " + this.email
            + ", Phone Number : " + this.phoneNumber
            + " }";
  }
}
