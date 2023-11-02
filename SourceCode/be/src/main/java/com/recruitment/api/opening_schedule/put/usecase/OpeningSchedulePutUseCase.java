package com.recruitment.api.opening_schedule.put.usecase;

import com.recruitment.api.opening_schedule.put.apirequest.OpeningSchedulePutApiRequest;
import com.recruitment.service.opening_schedule.OpeningScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpeningSchedulePutUseCase {

  private final OpeningScheduleService service;

  public void update(Long id, OpeningSchedulePutApiRequest request) {
    service.update(id, request);
  }
}
