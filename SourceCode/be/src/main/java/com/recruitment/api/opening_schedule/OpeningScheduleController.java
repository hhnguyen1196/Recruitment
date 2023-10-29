package com.recruitment.api.opening_schedule;

import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.api.opening_schedule.usecase.OpeningScheduleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpeningScheduleController {

    private final OpeningScheduleUseCase useCase;

    @GetMapping("/opening-schedules")
    public ResponseEntity<OpeningScheduleGetAllApiResponse> getAllOpeningSchedule() {
        return ResponseEntity.ok(null);
    }

}
