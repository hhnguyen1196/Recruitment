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
@Table(schema = "client", name = "opening_schedule")
public class OpeningSchedule extends CommonEntity {

  @Id
  @Column(name = "opening_schedule_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long openingScheduleId;

  @Column(name = "course_name")
  private String courseName;

  @Column(name = "opening_day")
  private LocalDate openingDay;

  @Column(name = "schedule")
  private String schedule;

  @Column(name = "time")
  private Integer time;

  @Column(name = "number_of_student")
  private Integer numberOfStudent;

  @Column(name = "province_id")
  private Integer provinceId;
}
