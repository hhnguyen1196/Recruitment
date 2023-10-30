package com.recruitment.api.opening_schedule.usecase;

import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.repository.client.opening_schedules.OpeningScheduleRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OpeningScheduleUseCase {

  private final OpeningScheduleRepository repository;

  public List<OpeningScheduleGetAllApiResponse> openingScheduleGetAllApiResponse() {
    return null;
  }
}
