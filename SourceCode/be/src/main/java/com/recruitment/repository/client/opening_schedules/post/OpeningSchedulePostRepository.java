package com.recruitment.repository.client.opening_schedules.post;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;
import org.springframework.stereotype.Repository;

/**
 * Repository for OpeningSchedule
 *
 * @author HaiNH
 */
public interface OpeningSchedulePostRepository {

  void insert(OpeningSchedulePostApiRequest request);
}
