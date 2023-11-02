package com.recruitment.repository.client.opening_schedules.put;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;

public interface OpeningSchedulePutRepository {

  void update(OpeningSchedulePostApiRequest request);
}
