package com.recruitment.api.opening_schedule.post;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;
import com.recruitment.api.opening_schedule.post.usecase.OpeningSchedulePostUseCase;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpeningSchedulePostController {

  private final OpeningSchedulePostUseCase useCase;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/opening-schedules")
  @Operation(summary = "Insert opening schedule")
  public void insertOpeningSchedule(@RequestBody OpeningSchedulePostApiRequest request) {
    useCase.insert(request);
  }
}