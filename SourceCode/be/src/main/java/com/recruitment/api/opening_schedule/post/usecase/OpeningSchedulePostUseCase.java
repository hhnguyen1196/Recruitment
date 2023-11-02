package com.recruitment.api.opening_schedule.post.usecase;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;
import com.recruitment.service.opening_schedule.OpeningScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpeningSchedulePostUseCase {

  private final OpeningScheduleService service;

  public void insert(OpeningSchedulePostApiRequest request) {
    service.insert(request);
  }
}
