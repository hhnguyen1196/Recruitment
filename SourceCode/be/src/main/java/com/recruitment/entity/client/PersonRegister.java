package com.recruitment.entity.client;

import com.recruitment.entity.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
@Table(schema = "client", name = "person_register")
public class PersonRegister extends CommonEntity {

  @Id
  @Column(name = "person_register_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long personRegisterId;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "birthday")
  private LocalDate birthday;

  @Column(name = "phone_number")
  private Integer phoneNumber;

  @Column(name = "email")
  private String email;

  @Column(name = "gender")
  private Integer gender;

  @Column(name = "work_type")
  private Integer workType;

  @Column(name = "school_id")
  private Integer schoolId;

  @Column(name = "faculty_id")
  private Integer facultyId;

  @Column(name = "province_id")
  private Integer provinceId;

  @Column(name = "graduate_year")
  private Integer graduateYear;

  @Column(name = "medium_score")
  private Double mediumScore;

  @Column(name = "level_id")
  private Integer levelId;

  @Column(name = "skill_id")
  private Integer skillId;

  @Column(name = "foreign_key")
  private String foreignKey;

  @Column(name = "experience")
  private Integer experience;

  @Column(name = "profile_url")
  private String profileUrl;
}
