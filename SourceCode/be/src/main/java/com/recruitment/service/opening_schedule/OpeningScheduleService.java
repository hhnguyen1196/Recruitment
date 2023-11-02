package com.recruitment.service.opening_schedule;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;
import com.recruitment.repository.client.opening_schedules.post.OpeningSchedulePostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpeningScheduleService {

  private final OpeningSchedulePostRepository repository;

  public void insert(OpeningSchedulePostApiRequest request) {
    repository.insert(request);
  }
}
