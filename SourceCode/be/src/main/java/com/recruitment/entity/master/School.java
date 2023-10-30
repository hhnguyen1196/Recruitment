package com.recruitment.entity.master;

import com.recruitment.entity.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema = "master", name = "school")
public class School extends CommonEntity {

  @Id
  @Column(name = "school_id")
  private Integer schoolId;

  @Column(name = "name")
  private String name;

  @Column(name = "code")
  private String code;

}
