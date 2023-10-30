package com.recruitment.dto.client;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpeningScheduleDTO {

  private Long openingScheduleId;

  private String courseName;

  private LocalDate openingDay;

  private String schedule;

  private Integer time;

  private Integer numberOfStudent;

  private Integer provinceId;
}
