package com.recruitment.api.opening_schedule.get;

import com.recruitment.api.opening_schedule.get.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.api.opening_schedule.get.apiresponse.OpeningScheduleGetApiResponse;
import com.recruitment.api.opening_schedule.get.usecase.OpeningScheduleGetUseCase;
import com.recruitment.util.ResponseDataConfiguration;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpeningScheduleGetController {

  private final OpeningScheduleGetUseCase useCase;

  @GetMapping("/opening-schedules")
  @Operation(summary = "Get all opening schedule")
  public ResponseEntity<OpeningScheduleGetAllApiResponse> getAllOpeningSchedule() {
    return ResponseDataConfiguration.success(useCase.getAllOpeningSchedule());
  }

  @GetMapping("/opening-schedules/{id}")
  @Operation(summary = "Get opening schedule by id")
  public ResponseEntity<OpeningScheduleGetApiResponse> getOpeningSchedule(@PathVariable Long id) {
    return ResponseDataConfiguration.success(useCase.getOpeningSchedule(id));
  }
}
