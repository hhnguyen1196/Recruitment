package com.recruitment.service.opening_schedule.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class OpeningSchedulePostServiceResponse {

  @JsonProperty("openingScheduleId")
  private Long openingScheduleId;
}
