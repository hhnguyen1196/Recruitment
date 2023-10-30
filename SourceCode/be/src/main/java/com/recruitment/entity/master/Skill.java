package com.recruitment.entity.master;

import com.recruitment.entity.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema = "master", name = "skill")
public class Skill extends CommonEntity {

  @Id
  @Column(name = "skill_id")
  private Integer skillId;

  @Column(name = "name")
  private String name;

  @Column(name = "code")
  private String code;

}
