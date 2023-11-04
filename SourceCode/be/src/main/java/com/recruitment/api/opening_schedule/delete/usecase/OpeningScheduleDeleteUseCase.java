package com.recruitment.api.opening_schedule.delete.usecase;

import com.recruitment.service.opening_schedule.OpeningScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OpeningScheduleDeleteUseCase {

  private final OpeningScheduleService service;

  public void delete(Long id) {
    service.delete(id);
  }
}
