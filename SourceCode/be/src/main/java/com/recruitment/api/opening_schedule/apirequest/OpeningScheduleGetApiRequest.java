package com.recruitment.api.opening_schedule.apirequest;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OpeningScheduleGetApiRequest {

    private Long courseId;

}
