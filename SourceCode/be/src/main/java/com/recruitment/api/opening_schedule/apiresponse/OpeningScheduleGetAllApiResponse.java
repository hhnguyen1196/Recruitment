package com.recruitment.api.opening_schedule.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public class OpeningScheduleGetAllApiResponse {

  @JsonProperty("openingScheduleId")
  private Long openingScheduleId;

  @JsonProperty("courseName")
  private String courseName;

  @JsonProperty("openingDay")
  private LocalDate openingDay;

  @JsonProperty("schedule")
  private String schedule;

  @JsonProperty("time")
  private Integer time;

  @JsonProperty("numberOfStudent")
  private String numberOfStudent;

  @JsonProperty("provinceName")
  private String provinceName;

}
