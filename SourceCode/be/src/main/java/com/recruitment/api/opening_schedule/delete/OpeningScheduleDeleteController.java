package com.recruitment.api.opening_schedule.delete;

import com.recruitment.api.opening_schedule.delete.usecase.OpeningScheduleDeleteUseCase;
import com.recruitment.api.opening_schedule.put.usecase.OpeningSchedulePutUseCase;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpeningScheduleDeleteController {

  private final OpeningScheduleDeleteUseCase useCase;

  @ResponseStatus(HttpStatus.CREATED)
  @DeleteMapping("/opening-schedules/{id}")
  @Operation(summary = "Delete opening schedule")
  public void updateOpeningSchedule(@PathVariable Long id) {
    useCase.delete(id);
  }
}