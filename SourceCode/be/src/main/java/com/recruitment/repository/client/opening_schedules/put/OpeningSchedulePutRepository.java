package com.recruitment.repository.client.opening_schedules.put;

import com.recruitment.api.opening_schedule.put.apirequest.OpeningSchedulePutApiRequest;

public interface OpeningSchedulePutRepository {

  void update(Long id, OpeningSchedulePutApiRequest request);
}
