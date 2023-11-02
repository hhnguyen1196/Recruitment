package com.recruitment.api.opening_schedule.get.usecase;

import com.recruitment.api.opening_schedule.get.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.api.opening_schedule.get.apiresponse.OpeningScheduleGetApiResponse;
import com.recruitment.config.exception.BusinessException;
import com.recruitment.dto.client.OpeningScheduleDTO;
import com.recruitment.repository.client.opening_schedules.get.OpeningScheduleGetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OpeningScheduleGetUseCase {

  private final OpeningScheduleGetRepository repository;

  public OpeningScheduleGetAllApiResponse getAllOpeningSchedule() {
    return OpeningScheduleGetAllApiResponse
        .builder()
        .openingScheduleList(repository.findAllOpeningSchedule())
        .build();
  }

  public OpeningScheduleGetApiResponse getOpeningSchedule(Long id) {
    OpeningScheduleDTO openingScheduleDTO = repository.findOpeningScheduleById(id)
        .orElseThrow(() -> new BusinessException(HttpStatus.BAD_REQUEST));
    return OpeningScheduleGetApiResponse
        .builder()
        .openingSchedule(openingScheduleDTO)
        .build();
  }
}
