package com.recruitment.api.opening_schedule.put;

import com.recruitment.api.opening_schedule.put.apirequest.OpeningSchedulePutApiRequest;
import com.recruitment.api.opening_schedule.put.usecase.OpeningSchedulePutUseCase;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpeningSchedulePutController {

  private final OpeningSchedulePutUseCase useCase;

  @ResponseStatus(HttpStatus.CREATED)
  @PutMapping("/opening-schedules/{id}")
  @Operation(summary = "Update opening schedule")
  public void updateOpeningSchedule(@PathVariable Long id,
                                    @RequestBody OpeningSchedulePutApiRequest request) {
    useCase.update(id, request);
  }
}