package com.recruitment.service.opening_schedule;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;
import com.recruitment.api.opening_schedule.put.apirequest.OpeningSchedulePutApiRequest;
import com.recruitment.repository.client.opening_schedules.delete.OpeningScheduleDeleteRepository;
import com.recruitment.repository.client.opening_schedules.post.OpeningSchedulePostRepository;
import com.recruitment.repository.client.opening_schedules.put.OpeningSchedulePutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpeningScheduleService {

  private final OpeningSchedulePostRepository postRepository;

  private final OpeningSchedulePutRepository putRepository;

  private final OpeningScheduleDeleteRepository deleteRepository;

  public void insert(OpeningSchedulePostApiRequest request) {
    postRepository.insert(request);
  }

  public void update(Long id, OpeningSchedulePutApiRequest request) {
    putRepository.update(id, request);
  }

  public void delete(Long id) {
    deleteRepository.delete(id);
  }
}
