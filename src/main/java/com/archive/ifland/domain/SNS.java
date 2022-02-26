package com.archive.ifland.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class SNS {

  private String instagram;

  private String facebook;

  private String blog;

}
