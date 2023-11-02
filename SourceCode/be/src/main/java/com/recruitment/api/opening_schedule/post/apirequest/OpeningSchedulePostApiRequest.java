package com.recruitment.api.opening_schedule.post.apirequest;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpeningSchedulePostApiRequest {

  private String courseName;

  private LocalDate openingDay;

  private String schedule;

  private Integer time;

  private Integer numberOfStudent;

  private Integer provinceId;
}
