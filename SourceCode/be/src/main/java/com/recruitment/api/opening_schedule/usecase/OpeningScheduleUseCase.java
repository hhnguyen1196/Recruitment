package com.recruitment.api.opening_schedule.usecase;

import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetApiResponse;
import com.recruitment.config.exception.BusinessException;
import com.recruitment.dto.client.OpeningScheduleDTO;
import com.recruitment.repository.client.opening_schedules.OpeningScheduleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OpeningScheduleUseCase {

  private final OpeningScheduleRepository repository;

  public OpeningScheduleGetAllApiResponse openingScheduleGetAllApiResponse() {
    return OpeningScheduleGetAllApiResponse
        .builder()
        .openingScheduleList(repository.findAllOpeningSchedule())
        .build();
  }

  public OpeningScheduleGetApiResponse openingScheduleGetApiResponse(Long id) {
    OpeningScheduleDTO openingScheduleDTO = repository.findOpeningScheduleById(
        id).orElseThrow(() -> new BusinessException(HttpStatus.BAD_REQUEST));
    return OpeningScheduleGetApiResponse
        .builder()
        .openingSchedule(openingScheduleDTO)
        .build();
  }
}
