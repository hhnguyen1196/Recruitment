package com.recruitment.api.opening_schedule.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.recruitment.dto.client.OpeningScheduleDTO;
import lombok.Builder;

@Builder
public class OpeningScheduleGetApiResponse {

  @JsonProperty("openingSchedule")
  private OpeningScheduleDTO openingSchedule;

}
