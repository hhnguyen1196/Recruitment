package com.recruitment.api.opening_schedule;

import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetApiResponse;
import com.recruitment.api.opening_schedule.usecase.OpeningScheduleUseCase;
import com.recruitment.util.ResponseDataConfiguration;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpeningScheduleController {

  private final OpeningScheduleUseCase useCase;

  @GetMapping("/opening-schedules")
  @Operation(summary = "Get all opening schedule")
  public ResponseEntity<OpeningScheduleGetAllApiResponse> getAllOpeningSchedule() {
    return ResponseDataConfiguration.success(useCase.openingScheduleGetAllApiResponse());
  }

  @GetMapping(value = "/opening-schedules/{id}")
  @Operation(summary = "Get opening schedule by id")
  public ResponseEntity<OpeningScheduleGetApiResponse> getOpeningSchedule(@PathVariable Long id) {
    return ResponseDataConfiguration.success(useCase.openingScheduleGetApiResponse(id));
  }
}
