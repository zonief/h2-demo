package com.zonief.h2demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApplicationUser {

  @Id
  private String id;
  private String name;
  private String email;
}
