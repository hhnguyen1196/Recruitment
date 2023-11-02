package com.recruitment.api.opening_schedule.get.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.recruitment.dto.client.OpeningScheduleDTO;
import java.util.List;
import lombok.Builder;

@Builder
public class OpeningScheduleGetAllApiResponse {

  @JsonProperty("openingScheduleList")
  List<OpeningScheduleDTO> openingScheduleList;
}
