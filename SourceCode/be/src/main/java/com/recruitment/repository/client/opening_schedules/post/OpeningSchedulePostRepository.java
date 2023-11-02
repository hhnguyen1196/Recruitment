package com.recruitment.repository.client.opening_schedules.post;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;

public interface OpeningSchedulePostRepository {

  void insert(OpeningSchedulePostApiRequest request);
}
